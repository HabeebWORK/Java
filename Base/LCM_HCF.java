import java.util.Collections;
import java.util.Scanner;

public class LCM_HCF {


    public static void main(String[] args) {
        int LCM=0;
        int Hcf=0;
        Scanner Numbers = new Scanner(System.in);
        System.out.println("Enter a Number :-");
        int Num1 = Numbers.nextInt();
        System.out.println("Enter another Number :-");
        int Num2 = Numbers.nextInt();
        int Nums = Math.min(Num1,Num2);

//        for(int i = 1; i< Nums; i++){
//            if(Num1%i == 0 && Num2%i == 0){
//
//                Hcf = i;
//
//                System.out.println("HCF OF"+ Num1 + "&" + Num2 + " = " + Hcf);
//            }
//        }

        for (int i = 2; i <= Nums; i++) {
            if (Num1 % i == 0 && Num2 % i == 0) {
                Hcf = i;
            }
        }
        System.out.println("HCF OF " + Num1 + " & " + Num2 + " = " + Hcf);

        LCM=(Num1+Num2)/Hcf;

        System.out.println("LCM OF"+ Num1 + "&" + Num2 + " = " + LCM);






    }
}
