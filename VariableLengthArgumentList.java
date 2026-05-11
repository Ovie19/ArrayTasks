public class VariableLengthArgumentList {
    public static void main(String... args) {
        System.out.println(average(1, 2));
        System.out.println(average(1, 2, 3));
        System.out.println(average(1, 2, 3, 4));
        System.out.println(average(1, 2, 3, 4, 5));
        System.out.println(average(1, 2, 3, 4, 5, 6));
    }

    public static double average(int... numbers) {
        int count = 0;
        double total = 0;

        for (int number: numbers) {
            total += number;
            count++;
        }

        return total / count;
    }
}