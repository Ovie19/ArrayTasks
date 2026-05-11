public class TaskTen {
    public static int[] taskTen(int[] numbers) {
        int[] array = new int[numbers.length];

        int total = 0;
        for(int index = 0; index < numbers.length; index++) {
            total += numbers[index];
            array[index] = total;
        }

        return array;
    }
}