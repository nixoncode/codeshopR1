import org.example.Question1;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question1Test {
    Question1 question1;

    @BeforeEach
    void setUp(){
        question1 = new Question1();
    }

    @Test
    void testExample1(){
        String expect = "blue is sky the";
        String actual = question1.reverseString("the sky is blue");
        assertEquals(expect, actual);
    }

    @Test
    void testExample2(){
        String expect = "world hello";
        String actual = question1.reverseString("  hello world  ");
        assertEquals(expect, actual);
    }

    @Test
    void testExample3(){
        String expect = "example good a";
        String actual = question1.reverseString("a good   example");
        assertEquals(expect, actual);
    }
    @Test
    void testExample4(){
        String expect = "Alice Loves Bob";
        String actual = question1.reverseString("  Bob    Loves  Alice   ");
        assertEquals(expect, actual);
    }
    @Test
    void testExample5(){
        String expect = "bob like even not does Alice";
        String actual = question1.reverseString("Alice does not even like bob");
        assertEquals(expect, actual);
    }
}
