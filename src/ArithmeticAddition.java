import java.util.Scanner;

public class ArithmeticAddition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  first number =" );
        int num1 = sc.nextInt();

        System.out.println("Enter the  Second number =" );
        int num2 = sc.nextInt();

        int addition =num1 +num2;
        System.out.println("Addition of number is=" +addition);
    }
}
