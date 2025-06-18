import java.util.Scanner;
public class BitwiseAndOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find Bitwise AND of two numbers");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();
        int result = num1&num2;
        System.out.println("The result of : "+ num1 + " and " + num2 + " is "+ result);
    }
}
