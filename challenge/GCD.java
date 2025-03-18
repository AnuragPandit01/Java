import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int gcd = gcd(num1, num2);
        System.out.print("The greatest common divisor of " + num1 + " and " + num2 + " is " + gcd);
    }
    public static int gcd(int num1, int num2){
        while(num2 != 0){
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        return num1;
    }
}
