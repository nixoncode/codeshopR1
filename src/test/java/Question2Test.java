import org.example.Question2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question2Test {

    Question2 question2;

    @BeforeEach
    void setUp(){
        question2 = new Question2();
    }


    @Test
    void testExample1(){
        int[][] example = {
                {1, 2, 3, 4},
                {2, 1, 4, 3},
                {3, 4, 1, 2},
                {4, 3, 2, 1},
        };

        String expect = "[4,0,0]";
        String actual = question2.processMatrix(example);

        assertEquals(expect, actual);

    }

    @Test
    void testExample2(){
        int[][] example = {
                {2, 2, 2, 2},
                {2, 3, 2, 3},
                {2, 2, 2, 3},
                {2, 2, 2, 2},
        };

        String expect = "[9,4,4]";
        String actual = question2.processMatrix(example);

        assertEquals(expect, actual);

    }

}
