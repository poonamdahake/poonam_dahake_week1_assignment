import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        String temp;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Select Symbol(+,-,*,/)");
            String symbol = sc.next();

            System.out.println("Enter the First Number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter the Second Number");
            double num2 = sc.nextDouble();

            double res;
            switch (symbol) {
                case "+":
                    res = num1 + num2;
                    System.out.println("Addition is :" + res);
                    break;

                case "-":
                    res = num1 - num2;
                    System.out.println("Subtraction is :" + res);
                    break;

                case "*":
                    res = num1 * num2;
                    System.out.println("Multiplication is :" + res);
                    break;

                case "/":
                    res = num1 / num2;
                    System.out.println("Division is :" + res);
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.println("Do u want to continue (Click 'Y' for Yes and 'N' for No)");
            temp=sc.next();
        }while (temp.equals("Y")||temp.equals("y"));

        }

    }

