import java.util.Scanner;

public class GCD_LCM_HCF_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first positive integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second positive integer: ");
        int num2 = scanner.nextInt();

        int originalNum1 = num1;
        int originalNum2 = num2;

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        int gcd = num1;
        int hcf = gcd;

        long lcm = (long) originalNum1 * originalNum2 / gcd;

        System.out.println("The GCD (Greatest Common Divisor) is: " + gcd);
        System.out.println("The HCF (Highest Common Factor) is: " + hcf);
        System.out.println("The LCM (Least Common Multiple) is: " + lcm);

        scanner.close();
    }
}
