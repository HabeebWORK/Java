package PACK2_FIRST_PROGRAMS;

import java.util.Scanner;

public class INR_USD {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);


        System.out.println("Indian Rupees :");
        double Indian_Rupees = Input.nextInt();

        double USD = Indian_Rupees * 82.90 ;

        System.out.println("INDIAN RUPEES IN USD = "+USD);






    }
}
