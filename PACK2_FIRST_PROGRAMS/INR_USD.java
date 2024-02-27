package PACK2_FIRST_PROGRAMS;

import java.util.Scanner;

public class INR_USD {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);


        System.out.println("ENTER USD :");
        double USD = 82.90;

        double Indian_Rupees = Input.nextInt();

        Double INDIAN = Indian_Rupees * USD;

        System.out.println("INDIAN RUPEES IN USD = "+INDIAN);






    }
}
