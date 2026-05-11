import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskTwoTest {
    @Test
    public void testThatTaskTwoCollectsAnArrayAndReturnsThemInReverseOrder() {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] expected = TaskTwo.taskTwo(numbers);
        int[] actual = {5, 4, 3, 2, 1};
        assertArrayEquals(actual, expected);
    }
}