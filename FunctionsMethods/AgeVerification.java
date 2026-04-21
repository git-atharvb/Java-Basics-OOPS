package BasicJavaPrograms.FunctionsMethods;
import java.util.Scanner;
public class AgeVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        boolean isEligible = verifyAge(age);
        if (isEligible) {
            System.out.println("You are eligible.");
        } else {
            System.out.println("You are not eligible.");
        }
        sc.close();
    }
    public static boolean verifyAge(int age) {
        return age >= 18; // Assuming 18 is the minimum age for eligibility
    }
}