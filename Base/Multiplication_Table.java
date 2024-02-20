package Base;

import java.util.Scanner;

public class Multiplication_Table {

    public static void main(String[] args) {

        System.out.println("which table of multiplications you want :");
        Scanner Number = new Scanner(System.in);

        int num = Number.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println( num +"*"+ i + "=" + i*num );

        }

    }

}
