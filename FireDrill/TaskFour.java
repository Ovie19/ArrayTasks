public class TaskFour {

    public static int[] taskFour(int[] numbers) {
        int count = 0;

        for(int number: numbers) {
            if(number % 2 == 0)
                count++;
        }

        int[] evenNumbers = new int[count];

        int index = 0;
        for(int number: numbers) {
            if(number % 2 == 0)
                evenNumbers[index++] = number;
        }

        return evenNumbers;
    }
}