import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int palindrom = palindrome(num);
        if(palindrom == num){
            System.out.println(palindrom + " is a palindrome number");
        }else{
            System.out.println(palindrom + " is not a palindrome number");
        }
    }
    public static int palindrome(int num){
        int newNum = 0;
        while(num>0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}
