import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("Given number is an Armstrong Number");
        }else{
            System.out.println("Given number is not an Armstrong Number");
        }
    }
    public static boolean isArmstrong(int num){
        int finalNum = 0;
        int originalNum = num; // Store the original number
        int noOfDigitsdigits = noOfDigits(num);
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNum += power(lastDigit, noOfDigitsdigits);
        }
        return finalNum == originalNum;
    }

    public static int power(int num1, int num2){
        int result = num1;
        int i = 1;
        while(i < num2){
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num/= 10;
        }
        return digits;
    }
}
