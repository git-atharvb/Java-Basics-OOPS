package BasicJavaPrograms.PatternPrograms;

public class HalfPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the half pyramid
        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Loop to print stars in each row
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
