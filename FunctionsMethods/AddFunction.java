package BasicJavaPrograms.FunctionsMethods;
import java.util.Scanner;
public class AddFunction {
    public static int addTwoNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=addTwoNumbers(a, b);
        System.out.println("Sum of two numbers is: " + sum);
        sc.close();
    }
}
