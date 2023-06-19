import java.util.Scanner;
public class LAB3 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];

        int space = scnr.nextInt();
        for (int i = 0; i < space; ++i) {
            userValues[i] = scnr.nextInt();
        }

        int threshold = scnr.nextInt();
        for (int i = 0; i < space; ++i) {
            if (userValues[i] <= threshold) {
                System.out.print(userValues[i] + ",");
            }
        }
        System.out.println();

    }

}