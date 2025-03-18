import java.util.Scanner;
public class SumOfOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = input.nextInt();
        int result = sumOddNum(num);
        System.out.println("Sum of odd numbers: " + result);
    }
    public static int sumOddNum(int num){
        int sum = 0;
        int i = 1;
        while(i <= num) {
            if(i % 2 != 0) {
            sum += i;
            }
            i++;
        }
        return sum; 
    }
    }