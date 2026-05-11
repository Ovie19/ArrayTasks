import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskEightTest {
    @Test
    public void testThatTaskEightReturnsTheIndexOfAnElementInAnArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int target = 4;
        int expected = TaskEight.taskEight(numbers, target);
        int actual = 3;
        assertEquals(actual, expected);

        target = 12;
        expected = TaskEight.taskEight(numbers, target);
        actual = -1;
        assertEquals(actual, expected);
    }
}