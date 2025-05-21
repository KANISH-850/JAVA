public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < i * 4; k++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= (i + 1); j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
