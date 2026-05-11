import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);

        int[] array = new int[101];

        for(int index = 1; index < array.length; index++) {
            array[index] = -1;
        }

        int count = 0;

        while(count < 10) {
            int number;
            do {
                System.out.print("Enter a number between 10 - 100: ");
                number = inputCollector.nextInt();

                if (number < 10 || number > 100)
                    System.out.println("Invalid number");
            } while(number < 10 || number > 100);

            array[number]++;
            count++;
        }

        for(int index = 1; index < array.length; index++) {
            if (array[index] == 0)
                System.out.print(index + " ");
        }
    }
}