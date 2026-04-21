package BasicJavaPrograms.FunctionsMethods;
import java.util.Scanner;
public class RadiusCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        sc.close();
        double area = calculateArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}