import java.util.Arrays;

public class Main {

    /**
     * Bubble sort.
     *
     * @param numbers Array<Int> Numbers to sort
     * @param type String type of sorting (asc|desc)
     */
    static int[] BubbleSort(int[] numbers, String type) {
        System.out.print("Your array input: " + Arrays.toString(numbers) +"\n\n");
        int i;
        // Setting flag to true to start sorting
        boolean flag = true;
        // Temporary placeholder
        int temp;

        while (flag) {
            flag = false;
            if (type == "asc") {
                for (i = 0; i < numbers.length-1; i++) {
                    if (numbers[i] > numbers[i+1]) {
                        temp = numbers[i];
                        numbers[i] = numbers[i+1];
                        numbers[i+1] = temp;
                        flag = true;
                    }
                }
            } else {
                for (i = 0; i < numbers.length-1; i++) {
                    if (numbers[i] < numbers[i+1]) {
                        temp = numbers[i];
                        numbers[i] = numbers[i+1];
                        numbers[i+1] = temp;
                        flag = true;
                    }
                }
            }
        }

        // Print out sorted array
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {34, 65, 1, 55, 98, 45};

        // Call bubble sort method
        int[] sortedArray = BubbleSort(numbers, "desc");
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }
}
