package BasicJavaPrograms.AdvancedPatterns;

public class PalindromicPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the palindromic pyramid

        for (int i = 1; i <= n; i++) { // Loop through each row
            // Print spaces before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print the left side of the pyramid
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print the right side of the pyramid
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
