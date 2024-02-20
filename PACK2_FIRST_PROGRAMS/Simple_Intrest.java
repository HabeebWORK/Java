//Write a program to input principal, time, and rate (P, T, R) from the user
// and find Simple Interest.
package PACK2_FIRST_PROGRAMS;

import java.util.Scanner;

public class Simple_Intrest {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);


        System.out.println("Enter Principle Amount :");
        int principal = Input.nextInt();
        System.out.println("Enter Time :");
        float Time = Input.nextFloat();
        System.out.println("Enter Rate :");
        float rate = Input.nextFloat();

        // formula is

        float simpleIntrest = principal*Time*rate;
        System.out.println("your Simple intrest is = " + simpleIntrest);


    }
}
