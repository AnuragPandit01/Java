import java.util.Scanner;
public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int lcm = lcm(num1, num2);
        System.out.print("The least common multiple of " + num1 + " and " + num2 + " is " + lcm);

    }
    public static int lcm(int num1, int num2){
        int i =1;
        while(true){
            int factor = num1*i;
            if(factor % num2 == 0){
                return factor;
            }
            i++;
        }
    }
}
