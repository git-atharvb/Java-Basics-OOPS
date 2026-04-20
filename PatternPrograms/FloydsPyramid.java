package BasicJavaPrograms.PatternPrograms;

public class FloydsPyramid {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for Floyd's Pyramid
        int number = 1; // Starting number for the pyramid

        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Loop to print numbers in each row
                System.out.print(number + " "); // Print the current number followed by a space
                number++; // Increment the number for the next position
            }
            System.out.println(); // Move to the next line after each row
        }
    }   
}
