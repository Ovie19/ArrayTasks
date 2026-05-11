import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskOneTest {
    @Test
    public void testThatTaskOneCollectsTenIntegersStoresAndReturnsThemInAnArray() {
        int[] expected = TaskOne.taskOne(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int[] actual = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(actual, expected);
    }
}