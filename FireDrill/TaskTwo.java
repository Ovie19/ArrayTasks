public class TaskTwo {

    public static int[] taskTwo(int[] numbers) {
        int[] newArray = new int[numbers.length];

        int count = numbers.length - 1;
        for(int number: numbers) {
            newArray[count--] = number;
        }

        return newArray;
    }
}