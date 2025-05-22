import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Sequence (first " + n + " terms): ");

        if (n >= 1) {
            System.out.print(a);
        }
        if (n >= 2) {
            System.out.print(" " + b);
        }

        for (int i = 3; i <= n; i++) {
            int nextTerm = a + b;
            System.out.print(" " + nextTerm);
            a = b;
            b = nextTerm;
        }
        System.out.println();

        scanner.close();
    }
}
