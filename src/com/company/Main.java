package com.company;

public class Main {

    public static void main(String[] args) {
	    // Strings are a data type in java. Complex Objects.
        // Immutability means it can be changed
        // A string literal is a string not assigned to variable

        String a = "APPLE";
        // concatenation is simple joining two strings together
        String me = "I love";
        String sentence = me.trim() + a;

        // Byte, Short, Integer, Long, Float, Double => wrapper class
//        byte, short, int, long, float, double
        double eight = 3.1452669;
        float number = (float)eight;
//        System.out.println(number);

        // java.lang
        String five = "5";
        double five5 = Double.parseDouble(five);

        System.out.println(Integer.max((int)five5, 7));

 //       System.out.println(sentence);

        // 1. Write a program to takes a String
        // and print the number of vowels in that String.

        // 2. Write a program that adds the value two strings
        // using the wrapper classes to parse the strings.
    }
}
