package BasicJavaPrograms.PatternPrograms;
public class MathsBase {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        // Basic Arithmetic Operations
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("Number 1 : " + a);
        System.out.println("Number 2 : " + b);
        System.out.println("Sum : " + sum);
        System.out.println("Difference : " + difference);
        System.out.println("Product : " + product);
        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder : " + remainder);
        int answer1 = (a + b) * (a - b); // Using parentheses to change the order of operations
        System.out.println("Answer 1 : " + answer1);
        int answer2 = a + b / a - b; // Without parentheses, multiplication is performed before addition and subtraction
        System.out.println("Answer 2 : " + answer2);
    }
}