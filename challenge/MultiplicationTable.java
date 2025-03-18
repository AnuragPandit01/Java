import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = input.nextInt();
        printMultiplication(num);
    }
    public static void printMultiplication(int num){
        for (int i = 1; i<=10; i++){
            System.out.println(num + "X" + i + "=" + num*i);
        }
    }
}
