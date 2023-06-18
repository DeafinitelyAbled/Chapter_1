import java.util.Scanner;
public class ReversingArrayElements {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_SIZE = 10;
        int[] arrayElement = new int[NUM_SIZE];
        int i;

        System.out.println("Enter " + NUM_SIZE + " integer values: ");

        // the following for loop reads the user input
        for (i = 0; i < arrayElement.length; ++i) {
            System.out.print("Value " + (i + 1) + ": ");
            arrayElement[i] = scnr.nextInt();
        }

        System.out.println();
        System.out.println("Non-reversed user-entered elements: ");

        // the following for loop outputs the user entered elements
        for (i = 0; i < arrayElement.length; ++i) {
            System.out.print(arrayElement[i] + " ");
        }

        // the following for loop reverses the user entered elements
        // the half length prevents iterating all over mistakenly (for reverse)
        for (i = 0; i < (arrayElement.length / 2); ++i) {
            // to keep the data stored in temporary variable
            int temp = arrayElement[i];
            // to assign the last element with the first index
            arrayElement[i] = arrayElement[arrayElement.length - 1 - i];
            // to assign the first index stored in temporary variable with the last index
            arrayElement[arrayElement.length - 1 - i] = temp;
        }

        System.out.println();
        System.out.println("Reversed user-entered elements: ");

        // the following for loop outputs the user entered elements in reversed form
        for (i = 0; i < arrayElement.length; ++i) {
            System.out.print(arrayElement[i] + " ");
        }

    }

}