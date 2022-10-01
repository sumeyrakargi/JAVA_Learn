package j04_AritmeticOperators.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir numara giriniz :");
        int num1= sc.nextInt();
        System.out.println("Bir numara daha giriniz :");
        int num2= sc.nextInt();
        System.out.println(num1+num2);

    }
}
