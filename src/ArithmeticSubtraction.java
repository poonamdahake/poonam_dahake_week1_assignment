import java.util.Scanner;

public class ArithmeticSubtraction {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  first number =" );
        int num1 = sc.nextInt();

        System.out.println("Enter the  Second number =" );
        int num2 = sc.nextInt();

        int sub =num1-num2;
        System.out.println("Subtraction is=" +sub);
    }
}
