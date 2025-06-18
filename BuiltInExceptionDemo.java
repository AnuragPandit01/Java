public class BuiltInExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int index = 5;
        int divisor = 0;

        try {
            // Attempt to access an array index that may not exist
            System.out.println("Attempting to access array at index " + index);
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);

            // Attempt division by zero
            System.out.println("\nAttempting division by " + divisor);
            int result = numbers[0] / divisor;
            System.out.println("Result of division: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } 
        finally {
            System.out.println("This is the finally block - executed regardless of exception");
        }

        System.out.println("Program continues after exception handling.");
    }
}