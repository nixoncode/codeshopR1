package org.example;

import com.google.gson.Gson;

import java.util.HashSet;
import java.util.Set;

public class Question2 {


    public String processMatrix(int[][] arr) {
        int sum = sumOfDiagonals(arr);
        int rowDuplicates = rowsWithRepeatedElements(arr);
        int colDuplicates = columnsWithRepeatedElements(arr);

        int[] results = {sum, rowDuplicates, colDuplicates};
        Gson gson = new Gson();
        return gson.toJson(results);
    }

    public static int sumOfDiagonals(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // as it's a 2d matrix, no need for a double loop
            sum += arr[i][i];
        }
        return sum;
    }

    public static int rowsWithRepeatedElements(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean hasDuplicate = false;
            Set<Integer> seen = new HashSet<>();
            for (int j = 0; j < arr.length; j++) {
                if (!seen.add(arr[i][j])) {
                    hasDuplicate = true;
                }
            }
            if (hasDuplicate) {
                sum += 1;
            }
        }
        return sum;
    }

    public static int columnsWithRepeatedElements(int[][] arr) {
        int count = 0;

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                boolean hasDuplicates = false;
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[j][i] == arr[k][i]) {
                        count++;
                        hasDuplicates = true;
                        break;
                    }
                }
                if (hasDuplicates) {
                    break;
                }
            }
        }
        return count;
    }
}