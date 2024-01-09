import org.example.Question4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question4Test {
    Question4 question;

    @BeforeEach
    void setUp(){
        question = new Question4();
    }

    @Test
    void TestInterval1(){
        int[][] interval = {{1,2},{2,3},{3,4},{1,3}};
        int expect = 1;
        int actual = question.eraseOverlapIntervals(interval);

        assertEquals(expect, actual);
    }
    @Test
    void TestInterval2(){
        int[][] interval = {{1,2},{1,2},{1,2}};
        int expect = 2;
        int actual = question.eraseOverlapIntervals(interval);

        assertEquals(expect, actual);
    }
    @Test
    void TestInterval3(){
        int[][] interval = {{1,2},{2,3}};
        int expect = 0;
        int actual = question.eraseOverlapIntervals(interval);

        assertEquals(expect, actual);
    }
}
