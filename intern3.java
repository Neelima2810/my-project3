import java.util.Scanner;
import java.util.Random;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Dividing by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operator. Please enter +, -, *, or /.");
                return;
        }

        System.out.printf("The result of %.2f %c %.2f is %.2f\n", num1, operator, num2, result);
    }
}