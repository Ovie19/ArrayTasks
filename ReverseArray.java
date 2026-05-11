import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);

        int[] numbers = new int[10];

        for(int index = 0; index < numbers.length; index++) {
            System.out.print("Enter a number: ");
            numbers[index] = inputCollector.nextInt();
        }

        System.out.println("\nBefore reversing");
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println(Arrays.toString(numbers));

        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int tempValue = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = tempValue;

            left++;
            right--;
        }

        System.out.println("\nAfter reversing");
        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println(Arrays.toString(numbers));
    }
}