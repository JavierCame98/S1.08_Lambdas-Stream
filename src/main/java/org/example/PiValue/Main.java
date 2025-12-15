package org.example.PiValue;

public class Main {

    public static void main(String[] args) {
        PiValue pi = () -> 3.1415;

        double value = pi.getPiValue();

        System.out.println("The value of Pi is: " + value);
    }


}
