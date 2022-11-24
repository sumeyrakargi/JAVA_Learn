package j10_String_Manipulation;

import java.util.Scanner;

public class C04_Contains {

    public static void main(String[] args) {

        /*
        String içerisinde istenen stringin varkığını kontrol eder boolean return eder.
         */

        String s1=" Yusuf Bey başarılı bir Trader";
        System.out.println( s1.contains("Bey"));//true
        System.out.println( s1.contains("Y"));//true
        System.out.println(s1.contains("P"));//false

        String s2="bir";
        System.out.println(s1.contains(s2));//true
        System.out.println(s2.contains(s1));//false

        //TASK-->girilen bir cümlede aranan kelimenin varlığını concate eden bir code create ediniz.turner kullanınız.

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cümle=sc.nextLine();
        System.out.println("lütfen aradığınız kelimeyi giriniz");
        String kelime= sc.nextLine();
        System.out.println(cümle.contains(kelime)?"içeriyor":"içermiyor");





    }
}
