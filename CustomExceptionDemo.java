class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        int[] ages = {25, -5, 150, 30};

        for (int age : ages) {
            try {
                System.out.println("\nChecking age: " + age);
                validateAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Exception caught: " + e.getMessage());
            } finally {
                System.out.println("This is the finally block - executed regardless of exception");
            }
        }
    }
}