import java.util.Scanner;

public class Calculator {

    public double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root of a negative number is not defined");
        }
        return Math.sqrt(x);
    }

    public long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial of a negative number is not defined");
        }
        long result = 1;
        for (int i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public double ln(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is only defined for positive numbers");
        }
        return Math.log(x);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power Function");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter a number: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Result: " + calculator.sqrt(num1));
                        break;
                    case 2:
                        System.out.print("Enter an integer: ");
                        int num2 = scanner.nextInt();
                        System.out.println("Result: " + calculator.factorial(num2));
                        break;
                    case 3:
                        System.out.print("Enter a number: ");
                        double num3 = scanner.nextDouble();
                        System.out.println("Result: " + calculator.ln(num3));
                        break;
                    case 4:
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        double exponent = scanner.nextDouble();
                        System.out.println("Result: " + calculator.power(base, exponent));
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
