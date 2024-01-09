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

        System.out.println("Question 2");
        System.out.println("==========");
        Question2 question2 = new Question2();

        int[][] q2Example1 = {
                {1, 2, 3, 4},
                {2, 1, 4, 3},
                {3, 4, 1, 2},
                {4, 3, 2, 1},
        };
        int[][] q2Example2 = {
                {2, 2, 2, 2},
                {2, 3, 2, 3},
                {2, 2, 2, 3},
                {2, 2, 2, 2},
        };

        System.out.println(question2.processMatrix(q2Example1));
        System.out.println(question2.processMatrix(q2Example2));
    }
}
