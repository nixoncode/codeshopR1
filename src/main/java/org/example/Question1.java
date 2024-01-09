package org.example;

import java.util.ArrayList;

public class Question1 {

    public static void main(String[] args) {
        String input = "the sky is blue";
        String input2 = "  hello world  ";
        String input3 = "a good   example";
        String input4 = "  Bob    Loves  Alice   ";
        String input5 = "Alice does not even like bob";

        System.out.println(reverseString(input));
        System.out.println(reverseString(input2));
        System.out.println(reverseString(input3));
        System.out.println(reverseString(input4));
        System.out.println(reverseString(input5));
    }

    public static String reverseString(String s) {
        s = s.replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        ArrayList<String> rw = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            rw.add(words[(words.length - 1 - i)].replaceAll("\\s+", ""));
        }
        return String.join(" ", rw);
    }
}
