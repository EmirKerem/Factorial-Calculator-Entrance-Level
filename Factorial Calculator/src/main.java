
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Factorial Calculator");
        
        System.out.println("Please enter a number:");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
        else {
            long result = 1;
            for (int x = 1; x <= num; x++) {
                result *= x;
            }
            System.out.println("The factorial of " + num + " is " + Math.abs(result));
        }
    }
}

