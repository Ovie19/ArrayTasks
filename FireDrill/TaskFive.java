import java.util.ArrayList;

public class TaskFive {
    public static int[] taskFive(int[] numbers) {
        ArrayList<Integer> numbersList = new ArrayList<Integer>();

        for(int number: numbers) {
            if(!numbersList.contains(number))
                numbersList.add(number);
        }

        int[] array = new int[numbersList.size()];
        for(int index = 0; index < numbersList.size(); index++) {
            array[index] = numbersList.get(index);
        }

        return array;
    }
}