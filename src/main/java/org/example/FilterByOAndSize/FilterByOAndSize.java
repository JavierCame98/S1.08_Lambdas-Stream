package org.example.FilterByOAndSize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FilterByOAndSize {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("Cama");
        list.add("Polo");
        list.add("Caramelo");
        list.add("Elefante");


        List<String> filteredList = filterByOAndSize(list);
        System.out.println(filteredList);
    }




    public static List<String> filterByOAndSize (List<String> originalList){
        if(originalList == null){
            return Collections.emptyList();
        }

        List<String> filteredList = originalList.stream()
                .filter(s -> s.contains("o"))
                .filter(s -> s.length() > 5)
                .toList();

        return filteredList;
    }
}
