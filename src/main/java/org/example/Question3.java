package org.example;

import java.util.ArrayList;
import java.util.List;

public class Question3 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtracking(candidates, target, 0, current, result);
        return result;
    }

    private void backtracking(int[] candidates, int remainingTarget, int start, List<Integer> current, List<List<Integer>> result) {
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
