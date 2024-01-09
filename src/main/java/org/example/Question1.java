package org.example;

import java.util.ArrayList;

public class Question1 {
    public  String reverseString(String s) {
        s = s.replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        ArrayList<String> rw = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            rw.add(words[(words.length - 1 - i)].replaceAll("\\s+", ""));
        }
        return String.join(" ", rw);
    }
}
