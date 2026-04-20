package BasicJavaPrograms.PatternPrograms;

public class HoleInMatrix {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        // Making a pattern of stars in the form of rows and columns of 5*5 Matrix with a hole in the middle
        for (int i = 1; i <= rows; i++) { //OuterLoop       
            for (int j = 1; j <= columns; j++) { //InnerLoop
                if (i == 3 && j == 3) { // Condition to create a hole in the middle of the matrix
                    System.out.print("  "); // Print space instead of star for the hole
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();   
        }
    }
}