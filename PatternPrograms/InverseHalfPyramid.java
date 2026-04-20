package BasicJavaPrograms.PatternPrograms;
public class InverseHalfPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the inverse half pyramid
        for (int i = rows; i >= 1; i--) { // Loop through each row in reverse
            for (int j = 1; j <= i; j++) { // Loop to print stars in each row
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}