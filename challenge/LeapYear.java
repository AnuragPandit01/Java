import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("find if given year is leap year");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the year : ");
        int year = input.nextInt();
        if(year%4 == 0 && year%100 != 0 || year%400 ==0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
}
