package j11_Method_Creation;

import java.util.Scanner;

public class C02_MethodCreation {
    // girilen üç notun ortalamasını hesaplayan method create ediniz.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.notu giriniz");
        double not1=sc.nextDouble();

        System.out.println("2.notu giriniz");
        double not2=sc.nextDouble();

        System.out.println("3.notu giriniz");
        double not3=sc.nextDouble();
        System.out.println("ortalamanız :"+ortalama(not1,not2,not3));;
    }

      public static double ortalama(double a,double b,double c){
          return (a+b+c)/3;

      }




}


