import java.util.Arrays;

public class Main {

    private static int getMostPpopular(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        // Sort array before doing anything with it
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers) + "\n");

        // Starting values
        int popular = numbers[0];
        int previous = numbers[0];
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == previous) {
                count++;
                System.out.println("Count of this number is: " + count);
                System.out.println("Most popular number so far: " + popular);
            } else {
                System.out.println("Count of this number is: " + numbers[i]);

                popular = numbers[i];
                count = 1;
            }
        }

        return popular;
    }

    public static void main(String[] args) {
        int[] numbers = {13, 5, 0, 4, 4, 2, 3, 5, 5, 9, 8, 5};
        // Print starting array
        System.out.println("Your array input: " + Arrays.toString(numbers) + "\n");
        int popular = getMostPpopular(numbers);
        System.out.println("Most popular number from this array: " + popular);
    }
}
