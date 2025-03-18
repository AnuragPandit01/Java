import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.print("Your Number is Prime");
    }else{
            System.out.print("Your Number is Not Prime");
        }
    }
    public static boolean isPrime(int num){
        int i = 2;
        while(i < num){
            if(num %i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
