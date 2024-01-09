package org.example;

public class Main {

    public static void main(String[] args) {
        String q1Input = "the sky is blue";
        String q2Input2 = "  hello world  ";
        String q3Input3 = "a good   example";
        String q4Input4 = "  Bob    Loves  Alice   ";
        String q5Input5 = "Alice does not even like bob";

        Question1 question1 = new Question1();
        System.out.println("Question 1");
        System.out.println("==========");
        System.out.println(question1.reverseString(q1Input));
        System.out.println(question1.reverseString(q2Input2));
        System.out.println(question1.reverseString(q3Input3));
        System.out.println(question1.reverseString(q4Input4));
        System.out.println(question1.reverseString(q5Input5));
    }
}
