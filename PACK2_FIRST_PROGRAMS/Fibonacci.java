package PACK2_FIRST_PROGRAMS;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number to get Fibonacci Series :");
    int n = input.nextInt();

    int f1=0;
    int f2=1;
    int nextf=0;
    for(int i=2; i<n; i++){
        nextf = f1 + f2;
        System.out.println(nextf);
        f1=f2;
        f2=nextf;
    }

    }
}
