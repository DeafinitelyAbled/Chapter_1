import java.util.Scanner;

/*
 * Write a program that reads a list of integers and outputs those integers in reverse.
 * The input begins with an integer indicating the number of integers that follow.
 * For coding simplicity, follow each output integer by a comma, including the last one.
 * Assume that the list will always contain fewer than 20 integers.
 */

public class Lab_1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20];
        int numElements;

        numElements = scnr.nextInt();

        for (int i = 0; i < numElements; ++i) {
            userList[i] = scnr.nextInt();
        }

        for (int i = 0; i < (numElements / 2); ++i) {
            int temp = userList[i];
            userList[i] = userList[numElements - i - 1];
            userList[numElements - i - 1] = temp;
        }

        for (int i = 0; i < numElements; ++i) {
            System.out.print(userList[i] + ",");
        }
        System.out.println();

    }

}
