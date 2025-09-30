import java.util.Scanner;

package rvt;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting value: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending value: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
