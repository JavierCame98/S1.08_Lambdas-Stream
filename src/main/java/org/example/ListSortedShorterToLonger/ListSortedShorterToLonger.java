package org.example.ListSortedShorterToLonger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSortedShorterToLonger {

    public static void main(String[] args) {

        List<Object> originalList = new ArrayList<>();
        originalList.add("Hola");
        originalList.add(1);
        originalList.add("Macarron");
        originalList.add(34);
        originalList.add("Salamandra");
        originalList.add(123456789);


        List<Object> sortedList = originalList.stream().sorted(Comparator.comparingInt(
                i -> {
                    String allToString;
                    if(i instanceof String){
                        allToString = (String) i;
                    }else if(i instanceof Integer){
                        allToString = String.valueOf(i);
                    }else{
                        return 0;
                    }
                    return allToString.length();}
                )).collect(Collectors.toList());

        System.out.println(sortedList);
    }


}
