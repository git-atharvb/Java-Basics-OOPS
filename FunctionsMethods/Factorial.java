package BasicJavaPrograms.FunctionsMethods;
import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
        if (n<0){
            System.out.println("Factorial is not defined for negative numbers.");
        }
        int factorial = 1;
        for (int i = n; i >=1 ; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        factorial(n);
        sc.close();
    }
}