import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskNineTest {
    @Test
    public void testThatTaskNineReturnsOneSortedArrayOfTwoCombinedArrays() {
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {4, 5, 6};

        int[] expected = TaskNine.taskNine(arrayOne, arrayTwo);
        int[] actual = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(actual, expected);
    }
}