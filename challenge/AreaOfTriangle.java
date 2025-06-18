import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        
    System.out.println("find the area of a triangle");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Triangle's base in cms : ");
    double base = input.nextDouble();
    System.out.print("Enter the Triangle's height in cms : ");
    double height = input.nextDouble();
    double area = (base * height)/2;
    System.out.println("The area of the Triangle is "+ area + "cms^2");
    }
}
