import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskSevenTest {
    @Test
    public void testThatTaskSevenReturnsAnArrayWithDuplicatesNumbersRemoved() {
        int[] numbers = {12, 19, 13, 11, 4, 9};
        int[] expected = TaskSeven.taskSeven(numbers);
        int[] actual = {19, 13, 12, 11, 9, 4};
        assertArrayEquals(actual, expected);
    }
}