import java.util.Scanner;
public class FahrenheitToCelcius {
    public static void main(String[] args) {
        System.out.println("Conver Fahrenheit to Celcius");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit : ");
        double Fahrenheit = input.nextDouble();
        double Celcius = (Fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature in Celcius is " + Celcius + "°C");
    }
}
