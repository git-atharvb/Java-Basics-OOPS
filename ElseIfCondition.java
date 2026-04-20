package BasicJavaPrograms;

import java.util.Scanner;

public class ElseIfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Hello\nPress 2 for Namaste\nPress 3 for Bonjour");
        System.out.print("Enter your choice: ");
        int button = sc.nextInt();
        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid Button");
        }
        sc.close();
    }
}
