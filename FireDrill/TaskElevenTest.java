import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskElevenTest {
    @Test
    public void testThatTaskNineReturnsTheSecondLargestElementInAnArray() {
        int[] numbers = {1, 2, 3, 4};

        int expected = TaskEleven.taskEleven(numbers);
        int actual = 3;
        assertEquals(actual, expected);
    }
}