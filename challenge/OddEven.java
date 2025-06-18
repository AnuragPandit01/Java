import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        System.out.println("find if a number is odd or even");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        if(num%2 == 0){
            System.out.println(num +" The number is even");
        }else{
            System.out.println(num +" The number is odd");
        }
    }
}
