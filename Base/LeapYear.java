package Base;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args) {

        int year;
        Scanner intake = new Scanner(System.in);
        System.out.println(" Enter a year to check that it's a Leap year or not  ");

        year = intake.nextInt();

//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//            System.out.println("yes"+year+"is a leap year ");
//        }else {
//            System.out.println("No"+year+"is not a leap year");
//        }

         if ((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0)){
             System.out.println(year +" " +"YES" );
         }else System.out.println(year +" "+ "NO");

    }
}
