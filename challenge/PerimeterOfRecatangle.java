import java.util.Scanner;
public class PerimeterOfRecatangle {
    public static void main(String[] args) {
        System.out.println("Find Perimeter of a reactangle");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter all sides in cms : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        System.out.println("Perimeter of your reactangle is " + (a+b+c+d) + " cms");
    }
}
