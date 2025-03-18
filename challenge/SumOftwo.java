import java.util.Scanner;

public class SumOftwo {
    public static void main(String[] args) {
        System.out.println("welcome, please input two numbers to add");
        Scanner input = new Scanner(System.in);
        System.out.print("Integer one : ");
        int num1 = input.nextInt();
        System.out.print("Integer two : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.print("sum of : " + num1 + " and " + num2 +" is " + sum);



    }

}
