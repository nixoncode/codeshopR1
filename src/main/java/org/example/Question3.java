package org.example;

import java.util.ArrayList;
import java.util.List;

public class Question3 {

    public static void main(String[] args) {
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        List<List<Integer>> combinations = combinationSum(candidates1, target1);
        System.out.println(combinations);

        int[] candidates2 = {2};
        int target2 = 1;
        List<List<Integer>> combinations2 = combinationSum(candidates2, target2);
        System.out.println(combinations2);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtracking(candidates, target, 0, current, result);
        return result;
    }
    private static void backtracking(int[] candidates, int remainingTarget, int start, List<Integer> current, List<List<Integer>> result) {
        if (remainingTarget == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (remainingTarget - candidates[i] >= 0) {
                current.add(candidates[i]);
                backtracking(candidates, remainingTarget - candidates[i], i, current, result);
                current.remove(current.size() - 1); // Backtrack
            }
        }
    }
}
