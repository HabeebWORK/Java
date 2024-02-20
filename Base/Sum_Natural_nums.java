package Base;

import java.util.Scanner;

public class Sum_Natural_nums {
    public static void main(String[] args) {


        System.out.println("Enter a `n` Number to sum of all untile n ");
        Scanner Number = new Scanner(System.in);
        int Num = Number.nextInt();
        int Sum = 0;

        for(int i=1; i<Num; i++){
            Sum= Sum+i;
        }

        System.out.println(Sum);
    }
}
