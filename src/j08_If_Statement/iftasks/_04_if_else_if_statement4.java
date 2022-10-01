package j08_If_Statement.iftasks;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */


        double double1=895;
        double double2=56.4;
        if (double1>double2) System.out.println("double 1 is greater than double 2");
        else System.out.println("double 1 is smaller than double 2");

        System.out.println(double1>double2?"double 1 is greater than double 2":"double 1 is smaller than double 2");


    }
}
