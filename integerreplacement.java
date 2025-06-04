import java.util.Scanner; // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter a number (long type) for integer replacement: ");
        long user_n = scanner.nextLong(); // Read the user's input as a long

        // --- Process user_n ---
        long current_n = user_n; // Use a distinct variable for the calculation
        int ans = 0;
        for (; current_n > 1; ++ans) {
            if (current_n % 2 == 0) {
                current_n >>= 1;
            } else if (current_n == 3 || (current_n >> 1 & 1) == 0) {
                --current_n;
            } else {
                ++current_n;
            }
        }
        System.out.println("Integer Replacement for " + user_n + ": " + ans);

        scanner.close(); // Close the scanner to release system resources
    }
}
