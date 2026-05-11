import java.util.Scanner;

public class TaskOne {

//    public static int[] taskOne(int... numbers) {

//        int[] array = new int[10];
//
//        int count = 0;
//        for(int number: numbers) {
//            array[count++] = number;
//        }
//
//        return array;
//    }

    public static int[] taskOne(Scanner inputCollector) {
        int[] array = new int[10];

        for(int index = 0; index < array.length; index++) {
            System.out.print("Enter a number: ");
            array[index] = inputCollector.nextInt();
        }
    }
}