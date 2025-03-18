import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int result = factorialNumber(num);
        System.out.println("Factorial of "+num+" is "+result);
    }

    public static int factorialNumber(int num){
        int fact = 0;
        if(num <2){
           return 1;
        }
        else  if (num > 2){
            fact = 1;
            for(int i =1; i<=num; i++){
                fact = fact * i;
            }
        }
        return fact;
    }
    
}
