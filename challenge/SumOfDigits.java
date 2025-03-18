import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the digits : ");
    int num = input.nextInt();
    int sum = sumOfDigits(num);
    System.out.print("The sum of the digits is : " + sum);
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
}

