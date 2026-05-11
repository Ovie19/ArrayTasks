public class TaskThree {

    public static int[] taskThree(int[] numbers) {
        int count = 0;

        for(int number: numbers) {
            if(number % 2 != 0)
                count++;
        }

        int[] oddNumbers = new int[count];

        int index = 0;
        for(int number: numbers) {
            if(number % 2 != 0)
                oddNumbers[index++] = number;
        }

        return oddNumbers;
    }
}