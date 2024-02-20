//Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions)

package PACK2_FIRST_PROGRAMS;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Cal your two nums :");
        int Num1 = Input.nextInt();
        char operator = Input.next().charAt(0);
        int Num2 = Input.nextInt();
//
        if(operator == '+') {
            System.out.println(Num1 + Num2);
        } else if(operator == '*'){
            System.out.println(Num1*Num2);
        } else if(operator == '%'){
            System.out.println( Num1%Num2);
        } else if(operator == '-' ){
            System.out.println( Num1-Num2);
        }else System.out.println("Invalid operator");









        // i dont know y i am trying this -------+0-------


//        switch (operator) {
//            case "+":
//                System.out.println("You entered addition operator.");
//                break;
//            case "-":
//                System.out.println("You entered subtraction operator.");
//                break;
//            case "*":
//                System.out.println("You entered multiplication operator.");
//                break;
//            case "/":
//                System.out.println("You entered division operator.");
//                break;
//            default:
//                System.out.println("Invalid operator entered.");
//        }




//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the first number: ");
//        double num1 = scanner.nextDouble();
//
//        System.out.print("Enter the operator (+, -, *, /): ");
//        char operator = scanner.next().charAt(0);
//
//        System.out.print("Enter the second number: ");
//        double num2 = scanner.nextDouble();
//
//        double result = 0;
//
//        if (operator == '+') {
//            result = num1 + num2;
//        } else if (operator == '-') {
//            result = num1 - num2;
//        } else if (operator == '*') {
//            result = num1 * num2;
//        } else if (operator == '/') {
//            if (num2 != 0) {
//                result = num1 / num2;
//            } else {
//                System.out.println("Error: Division by zero!");
//                return;
//            }
//        } else {
//            System.out.println("Error: Invalid operator!");
//            return;
//        }
//
//        System.out.println("Result: " + result);
    }

























}
