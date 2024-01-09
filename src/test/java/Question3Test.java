import org.example.Question3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question3Test {
    Question3 question3;

    @BeforeEach
    void setUp() {
        question3 = new Question3();
    }

    @Test
    void TestCandidates1() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> actual = question3.combinationSum(candidates, target);
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(Arrays.asList(2, 2, 3));
        expect.add(List.of(7));

        assertEquals(expect, actual);
    }


    @Test
    void TestCandidates2() {
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> actual = question3.combinationSum(candidates, target);
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(Arrays.asList(2, 2, 2, 2));
        expect.add(Arrays.asList(2, 3, 3));
        expect.add(Arrays.asList(3, 5));

        assertEquals(expect, actual);
    }


    @Test
    void TestCandidates3() {
        int[] candidates = {2};
        int target = 1;
        List<List<Integer>> actual = question3.combinationSum(candidates, target);
        List<List<Integer>> expect = new ArrayList<>();

        assertEquals(expect, actual);
    }
}
