package BasicJavaPrograms.AdvancedPatterns;
public class Diamond {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the diamond pattern
        // Upper half of the diamond And the middle line
        for (int i = 1; i <= n; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces before the stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }   
}