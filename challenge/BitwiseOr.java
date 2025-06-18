import java.util.Scanner;
public class BitwiseOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("find Bitwise OR of two numbers");
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();
        int result = num1 | num2;
        System.out.println("Bitwise OR of "+num1+" and "+num2+" is "+result);
    }
}
