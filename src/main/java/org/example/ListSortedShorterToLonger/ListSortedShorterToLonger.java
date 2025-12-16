package org.example.ListSortedShorterToLonger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSortedShorterToLonger {

    public static void main(String[] args) {

        List<Object> originalList = new ArrayList<>();
        originalList.add("Hola");
        originalList.add(1);
        originalList.add("Macarron");
        originalList.add(34);
        originalList.add("Salamandra");
        originalList.add(123456789);


        List<String> sortedList = originalList.stream()
                .map(Object::toString).sorted(Comparator.comparingInt(
                        String::length)).toList();

        System.out.println(sortedList);
    }


}
