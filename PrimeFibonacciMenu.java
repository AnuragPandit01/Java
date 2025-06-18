import java.util.Scanner;

public class PrimeFibonacciMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menu:");
        System.out.println("1. Generate Prime Numbers");
        System.out.println("2. Generate Fibonacci Series");
        System.out.print("Enter your choice (1/2): ");
        int choice = sc.nextInt();
        
        System.out.print("Enter the limit number: ");
        int n = sc.nextInt();
        
        switch(choice) {
            case 1:
                printPrimes(n);
                break;
            case 2:
                printFibonacci(n);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        sc.close();
    }
    
    // Function to print prime numbers up to n
    public static void printPrimes(int limit) {
        System.out.println("\nPrime numbers up to " + limit + ":");
        for(int num = 2; num <= limit; num++) {
            if(isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
    
    // Helper function to check prime
    private static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    
    // Function to print Fibonacci series up to n terms
    public static void printFibonacci(int terms) {
        System.out.println("\nFibonacci series with " + terms + " terms:");
        int a = 0, b = 1;
        if(terms >= 1) System.out.print(a + " ");
        if(terms >= 2) System.out.print(b + " ");
        
        for(int i = 3; i <= terms; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
