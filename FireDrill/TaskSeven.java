import java.util.Arrays;

public class TaskSeven {

    public static int[] taskSeven(int[] numbers) {

        for(int index = 0; index < numbers.length; index++) {
            for(int innerIndex = index + 1; innerIndex < numbers.length; innerIndex++) {
                if(numbers[index] < numbers[innerIndex]) {
                    int temp = numbers[index];
                    numbers[index] = numbers[innerIndex];
                    numbers[innerIndex] = temp;
                }
            }
        }

        return numbers;
    }
}