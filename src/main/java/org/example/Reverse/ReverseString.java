package org.example.Reverse;

public class ReverseString {
    public static void main(String[] args) {

        ReverseFunctionalInterface reverser = (string -> {
            StringBuilder mutableString = new StringBuilder(string);
            mutableString.reverse();
            return mutableString.toString();

        });

        String originalString = "Hola mundo";
        String reverseString = reverser.reverse(originalString);

        System.out.println(reverseString);

    }
}
