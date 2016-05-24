import java.util.Arrays;

public class Main {

    private static int getMostPpopular(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        // Sort array before doing anything with it
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers) + "\n");

        // Let's assume first value is first int from array
        // and since we will start looping through array from [1],
        // we'll set previous to first number from array
        int popular = numbers[0];
        int previous = numbers[0];
        // Starting values
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == previous) {
                // Current number is same as previous, increment count!
                // Most popular number stays the same
                count++;
            } else {
                if (count > maxCount) {
                    popular = numbers[i-1];
                    maxCount = count;
                } else {
                    previous = numbers[i];
                    count = 1;
                }
            }
        }

        return count > maxCount ? numbers[numbers.length-1] : popular;
    }

    public static void main(String[] args) {
        int[] numbers = {13, 5, 0, 4, 4, 2, 3, 5, 5, 9, 8, 5};
        // Print starting array
        System.out.println("Your array input: " + Arrays.toString(numbers) + "\n");
        int popular = getMostPpopular(numbers);
        System.out.println("Most popular number is: " + popular);
    }
}
