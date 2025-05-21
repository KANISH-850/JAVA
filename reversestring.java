import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        String reversedString = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            char charToAdd = originalString.charAt(i);
            reversedString = reversedString + charToAdd;
        }

        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
