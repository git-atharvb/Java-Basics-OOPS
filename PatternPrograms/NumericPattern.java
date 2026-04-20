package BasicJavaPrograms.PatternPrograms;

public class NumericPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the numeric pattern
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Loop to print numbers in each row
                System.out.print(j + " "); // Print the current number followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
