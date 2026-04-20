package BasicJavaPrograms.AdvancedPatterns;

public class Butterfly {
    public static void main(String[] args) {
        int n = 5;
        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Right part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = n; i >= 1; i--) {
            // Left part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Right part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
