import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskThreeTest {
    @Test
    public void testThatTaskThreeReturnsAnArrayWithAllEvenNumbersRemoved() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = TaskThree.taskThree(numbers);
        int[] actual = {1, 3, 5, 7};
        assertArrayEquals(actual, expected);
    }
}