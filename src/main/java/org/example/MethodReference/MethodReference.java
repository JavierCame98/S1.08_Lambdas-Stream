package org.example.MethodReference;

import java.util.List;

public class MethodReference {

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

        monthList.forEach(month -> System.out.println(month));
    }
}
