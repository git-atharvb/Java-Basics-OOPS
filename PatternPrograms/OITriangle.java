package BasicJavaPrograms.PatternPrograms;

public class OITriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the 0-1 triangle
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Loop to print 0s and 1s in each row
                if ((i + j) % 2 == 0) { // Check if the sum of row and column indices is even
                    System.out.print("1 "); // Print 1 for even sum
                } else {
                    System.out.print("0 "); // Print 0 for odd sum
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
