/***
 * Creating a basic calculator based on UI, and using Switch cases ONLY.
 * A basic arithmetic operations based calculator which takes in the inputs (num1 && num2)
 * and returns the result. And asks the user whether he/she wants to input new values into
 * the calculator and displays the new result.
 ***/
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        boolean calculator = true;
        while (calculator) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();
            System.out.print("Enter the operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            switch (operation) {
                case '+':
                    double sum = 0.0;
                    sum = number1 + number2;
                    System.out.print("The result is: " + sum);
                    break;
                case '-':
                    double difference = 0.0;
                    difference = number1 - number2;
                    System.out.println("The result is: " + difference);
                    break;
                case '*':
                    double product = 0.0;
                    product = number1 * number2;
                    System.out.println("The result is: " + product);
                    break;
                case '/':
                    double quotient = 0.0;
                    quotient = number1 / number2;
                    System.out.println("The result is: " + quotient);
                    break;
                default:
                    System.out.print("No operation entered!");
            }
            System.out.println();
            System.out.println("*************************************");
            System.out.println("*************************************");

            System.out.println();
            System.out.print("Do you want to ue calculator again? (yes/no): ");
            String userChoice = scanner.next();
            if (userChoice.equalsIgnoreCase("no")) {
                calculator = false;
            }
        }
        System.out.println("Calculator successfully terminated!!");
    }
}
