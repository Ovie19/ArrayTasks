public class TaskEleven {
    public static int taskEleven(int[] numbers) {
        int largest = numbers[0];
        int secondLargest = largest;


        for(int index = 1; index < numbers.length; index++) {
            if(numbers[index] > largest) {
                secondLargest = largest;
                largest = numbers[index];
            } else if(numbers[index] > secondLargest){
                secondLargest = numbers[index];
            }
        }

        return secondLargest;
    }
}