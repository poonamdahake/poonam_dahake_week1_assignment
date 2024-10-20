import java.util.Scanner;
public class ArithmaticOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;

        System.out.println("Sum is: " + addition);
        System.out.println("Subtraction is: " + subtraction);
        System.out.println("Product is: " + multiplication);
        System.out.println("Division is: " + division);
    }
}

