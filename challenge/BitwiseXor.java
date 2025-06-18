import java.util.Scanner;
public class BitwiseXor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("find bitwise xor of two numbers");
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();
        int xor = num1 ^ num2;
        System.out.println("Bitwise xor of two numbers "+ num1 + " and " + num2 +" is : "+ xor);
    }
}
