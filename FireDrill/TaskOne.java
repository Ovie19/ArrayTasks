public class TaskOne {

    public static int[] taskOne(int... numbers) {

        int[] array = new int[10];

        int count = 0;
        for(int number: numbers) {
            array[count++] = number;
        }

        return array;
    }
}