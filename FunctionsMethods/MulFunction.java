package BasicJavaPrograms.FunctionsMethods;
import java.util.Scanner;
public class MulFunction {
    public static int mulTwoNumbers(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Multiplication of two numbers is: " + mulTwoNumbers(a, b)   );
        sc.close();
    }
}