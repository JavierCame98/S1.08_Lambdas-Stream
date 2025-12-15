package org.example.ForEach;

import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        List<String> monthList = List.of("January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        );

        monthList.forEach(System.out::println);
    }


}
