import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskTenTest {
    @Test
    public void testThatTaskTenReturnsEachElementInAnArrayReplacedByTheRunningTotal() {
        int[] numbers = {1, 2, 3, 4};

        int[] expected = TaskTen.taskTen(numbers);
        int[] actual = {1, 3, 6, 10};
        assertArrayEquals(actual, expected);
    }
}