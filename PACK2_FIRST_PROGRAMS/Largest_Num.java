package PACK2_FIRST_PROGRAMS;

import java.util.Scanner;

public class Largest_Num {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num1 = Input.nextInt();
        System.out.println("Enter another number :");
        int num2 = Input.nextInt();

        int Large_num = Math.max(num1,num2);
        System.out.println("Largest Number = "+ Large_num);


    }
}
