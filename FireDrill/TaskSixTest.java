import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskSixTest {
    @Test
    public void testThatTaskSixReturnsASortedAscendingArray() {
        int[] numbers = {12, 19, 13, 11, 4, 9};
        int[] expected = TaskSix.taskSix(numbers);
        int[] actual = {4, 9, 11, 12, 13, 19};
        assertArrayEquals(actual, expected);
    }
}