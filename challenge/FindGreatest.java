import java.util.Scanner;
public class FindGreatest {
    public static void main(String[] args) {
        System.out.println("find the greatest between three numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = input.nextInt();
        System.out.print("Enter 3rd number : ");
        int num3 = input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+" is the greatest");
        }else if(num2>num1 && num2>num3){
            System.out.println(num2+" is the greatest");
        }else{
            System.out.println(num3+" is the greatest");
        }
    }
}
