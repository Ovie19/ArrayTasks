public class TaskTwelve {
    public static int taskTwelve(int[] array) {
        int secondLargest = TaskEleven.taskEleven(array);

        int count = 0;
        for(int element: array) {
            if (element == secondLargest)
                count++;
        }

        if(count > 1)
            return -1;

        return secondLargest;
    }
}