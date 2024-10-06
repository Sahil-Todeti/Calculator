/***
 * Creating a basic calculator based on UI, and using Conditional statements ONLY.
 * A basic arithmetic operations based calculator which takes in the inputs (num1 && num2)
 * and returns the result. And asks the user whether he/she wants to input new values into
 * the calculator and displays the new result.
 ***/
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        boolean calculator = true;
        while (calculator) { // while the 'operations' is true, execute all these
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble(); // numerator
            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble(); // denominator
            System.out.print("Enter the operation (+, -, *, /): ");
            char opr = input.next().charAt(0); // reads the character

            // addition
            if (opr == '+') {
                System.out.print("The result is: " + (num1 + num2));
            }
            // subtraction
            else if (opr == '-') {
                System.out.print("The result is: " + (num1 - num2));
            }
            // multiplication
            else if (opr == '*') {
                if (num1 == 0 || num2 == 0) { // if any number is = 0
                    System.out.print("The result is: " + 0);
                }
                else { // if not, then
                    System.out.print("The result is: " + (num1 * num2));
                }
            }
            // division
            else if (opr == '/') {
                if (num1 == 0) {
                    System.out.print("The result is: " + 0);
                }
                else if (num2 == 0) {
                    System.out.print("MATH ERROR!! ");
                }
                else {
                    System.out.print("The result is: " + (num1 / num2));
                }
            }
            // if no operation is entered
            else {
                System.out.print("No operation entered!");
            }
            System.out.println();
            System.out.println("*************************************");
            System.out.println("*************************************");

            System.out.println();
            System.out.print("Do you want to use the calculator again? (say yes or no): ");
            String userChoice = input.next();

            // if the choice is false
            if (userChoice.equalsIgnoreCase("no")) {
                calculator = false;
            }
        }
        System.out.println("Calculator successfully terminated!!");
    }
}