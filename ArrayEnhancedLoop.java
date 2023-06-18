import java.util.Scanner;

public class ArrayEnhancedLoop {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        String[] arrayName = new String[10];

        // The for loop reads the user-entered items
        System.out.println("Enter 10 string items: ");
        for (int i = 0; i < arrayName.length; ++i) {
            System.out.print("Value " + (1 + i) + ": ");
            arrayName[i] = scnr.next();
        }

        System.out.println();

        // the following enhanced loop is short-written code
        // the enhanced for loop accesses available items from the array
        // the enhanced for loop prevents accessing the out-of-bound items
        for (String item : arrayName) {
            System.out.println(item);
        }
    }

}
