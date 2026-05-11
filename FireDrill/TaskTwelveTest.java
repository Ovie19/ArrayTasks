import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTwelveTest {
    @Test
    public void testThatTaskTwelveReturnsTheSecondLargestDistinctElementInAnArray() {
        int[] numbers = {1, 2, 3, 4};

        int expected = TaskTwelve.taskTwelve(numbers);
        int actual = 3;
        assertEquals(actual, expected);

        int[] arrayOne = {1, 2, 2, 3};
        expected = TaskTwelve.taskTwelve(arrayOne);
        actual = -1;
        assertEquals(actual, expected);

        int[] arrayTwo = {-4, -4, - 3, -2};
        expected = TaskTwelve.taskTwelve(arrayTwo);
        actual = -3;
        assertEquals(actual, expected);
    }
}