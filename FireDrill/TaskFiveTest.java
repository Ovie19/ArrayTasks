import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskFiveTest {
    @Test
    public void testThatTaskFiveReturnsAnArrayWithDuplicatesNumbersRemoved() {
        int[] numbers = {1, 1, 2, 2, 3, 3, 4, 4};
        int[] expected = TaskFive.taskFive(numbers);
        int[] actual = {1, 2, 3, 4};
        assertArrayEquals(actual, expected);
    }
}