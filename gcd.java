import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first positive integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second positive integer (b): ");
        int b = scanner.nextInt();

        int num1 = a;
        int num2 = b;

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        System.out.println("The GCD of " + a + " and " + b + " is: " + num1);

        scanner.close();
    }
}
