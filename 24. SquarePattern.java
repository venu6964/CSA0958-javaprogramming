import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        printPattern(rows);

        input.close();
    }

    public static void printPattern(int rows) {
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((num * num) + "\t");
                num++;
            }
            System.out.println();
        }
    }
}
