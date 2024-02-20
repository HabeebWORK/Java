
//2. Take two numbers and print the sum of both.

import java.util.Scanner;

public class sumof2 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num1 = num.nextInt();
        System.out.println("Enter another Number");
        int num2 = num.nextInt();

        int Add = num1 + num2 ;

        System.out.println(" the sum of both"+" " +Add);

    }
}
