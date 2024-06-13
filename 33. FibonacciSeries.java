import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the n value: ");
        int n = input.nextInt();

        printFibonacciSeries(n);

        input.close();
    }

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;

        if (n >= 1) {
            System.out.print(first + " ");
        }

        if (n >= 2) {
            System.out.print(second + " ");
        }

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
