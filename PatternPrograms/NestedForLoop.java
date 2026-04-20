package BasicJavaPrograms.PatternPrograms;
public class NestedForLoop {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;
        // Making a pattern of stars in the form of rows and columns of 5*5 Matrix
        for (int i = 1; i <= rows; i++) { //OuterLoop
            for (int j = 1; j <= columns; j++) { //InnerLoop
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}