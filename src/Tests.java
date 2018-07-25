import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

public class Tests {
    @Before
    public void setUp() {
        EargoCodingQuestions questions = new EargoCodingQuestions();
    }

    /**
     * Tests example input for question 1.
     */
    @Test
    public void q1ExampleTest() {
        int[] expectedResult = {3,0,1,3};
        assertArrayEquals(expectedResult, EargoCodingQuestions.findChange(83));
    }

    /**
     * Tests another example input for question 1.
     */
    @Test
    public void q1ExampleTwoTest() {
        int[] expectedResult = {4,0,0,3};
        assertArrayEquals(expectedResult, EargoCodingQuestions.findChange(103));
    }

    /**
     * Tests input for zero in question 1.
     */
    @Test
    public void q1ZeroTest() {
        int[] expectedResult = {0,0,0,0};
        assertArrayEquals(expectedResult, EargoCodingQuestions.findChange(0));
    }

    /**
     * Tests negative input in question 1.
     */
    @Test(expected = RuntimeException.class)
    public void q1NegativeTest() {
        EargoCodingQuestions.findChange(-2);
    }

    /**
     * Tests example input for question 2.
     */
    @Test
    public void q2ExampleTest() {
        int[] expectedResult = {6,9,53};
        int[] input = {3, 8, 8, 55, 38, 1, 7, 42, 54, 53};
        assertArrayEquals(expectedResult, EargoCodingQuestions.buyStock(input));
    }

    /**
     * Tests another example input for question 2.
     */
    @Test
    public void q2ExampleTwoTest() {
        int[] expectedResult = {1,4,98};
        int[] input = {1,4,1,99,4,6,7,77};
        assertArrayEquals(expectedResult, EargoCodingQuestions.buyStock(input));
    }

    /**
     * Tests input of size 1 for question 2.
     */
    @Test
    public void q2SingleValueTest() {
        int[] expectedResult = {1,1,0};
        int[] input = {1};
        assertArrayEquals(expectedResult, EargoCodingQuestions.buyStock(input));
    }

    /**
     * Tests empty array as input for question 2.
     */
    @Test
    public void q2EmptyValueTest() {
        int[] expectedResult = {1,1,0};
        int[] input = {};
        assertArrayEquals(expectedResult, EargoCodingQuestions.buyStock(input));
    }

}
