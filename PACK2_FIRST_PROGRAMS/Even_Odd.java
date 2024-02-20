package PACK2_FIRST_PROGRAMS;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {

        System.out.println("Enter a Number to check whether a Number is Even or Odd :");
        Scanner Number = new Scanner(System.in);

        int num = Number.nextInt();

        if(num%2==0){
            System.out.println("Yes" + " " + num + " " + "is a Even number");
        }else {
            System.out.println("Yes" + " " + num + " " + "is a Odd number");
        }
    }
}
