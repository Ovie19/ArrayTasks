import java.util.Arrays;

public class TaskEight {

    public static int taskEight(int[] numbers, int target) {

        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index] == target)
                return index;
        }

        return -1;
    }
}