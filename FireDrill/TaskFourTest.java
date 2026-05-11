import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskFourTest {
    @Test
    public void testThatTaskFourReturnsAnArrayWithAllOddNumbersRemoved() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = TaskFour.taskFour(numbers);
        int[] actual = {2, 4, 6};
        assertArrayEquals(actual, expected);
    }
}