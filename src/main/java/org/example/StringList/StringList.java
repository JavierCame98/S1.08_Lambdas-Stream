package org.example.StringList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StringList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("Cama");
        list.add("Polo");

        List<String> oList = filterByLetterO(list);
        System.out.println(oList);
    }

    public static List<String> filterByLetterO (List<String> originalList) {
        if (originalList == null) {
            return Collections.emptyList();
        }

        List<String> streamedList = originalList.stream()
                .filter(s -> s.contains("o"))
                .toList();
        return streamedList;
    }
}
