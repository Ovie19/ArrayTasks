public class TaskNine {
    public static int[] taskNine(int[] arrayOne, int[] arrayTwo) {
        int[] array = new int[arrayOne.length + arrayTwo.length];

        int count = 0;
        for(int number: arrayOne) {
            array[count++] = number;
        }

        for(int number: arrayTwo) {
            array[count++] = number;
        }

        return TaskSix.taskSix(array);
    }
}