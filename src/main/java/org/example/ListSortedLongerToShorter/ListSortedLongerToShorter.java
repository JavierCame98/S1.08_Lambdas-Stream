package org.example.ListSortedLongerToShorter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSortedLongerToShorter {

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
                String::length).reversed()).toList();

    System.out.println(sortedList);
    }
}
