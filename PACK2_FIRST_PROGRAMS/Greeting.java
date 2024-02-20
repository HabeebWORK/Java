//Take name as input and print a greeting message for that particular name.
package PACK2_FIRST_PROGRAMS;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Enter your Name :");
        Scanner Input = new Scanner(System.in);
        String Name = Input.next();

        Greet(Name);
    }

    public static void Greet(String a) {
        System.out.println("Hi Good to see you " +a);
    }
}


