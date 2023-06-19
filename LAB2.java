import java.util.Scanner;

public class LAB2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[9];
        int count = 0;  // Number of integers read

        while (scnr.hasNextInt()) {
            int num = scnr.nextInt();

            if (num < 0) {
                break;
            }

            if (count >= 9) {
                System.out.println("Too many numbers");
                return;
            }

            userValues[count] = num;
            count++;
        }

        System.out.print("User-entered elements: ");
        for (int i = 0; i < count; ++i) {
            System.out.print(userValues[i] + " ");
        }

        int middleIndex = count / 2;
        System.out.println("\nMiddle item: " + userValues[middleIndex]);

    }
}