package BasicJavaPrograms.FunctionsMethods;
import java.util.Scanner;
public class RaisedPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        double result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        sc.close();
    }
    public static double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}