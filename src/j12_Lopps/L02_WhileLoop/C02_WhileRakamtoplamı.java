package j12_Lopps.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileRakamtoplamı {
    public static void main(String[] args) {
        //Task girilen sayının rakamlarını toplayan code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println( "bir sayı giriniz");
        int sayı=sc.nextInt();
        System.out.println(rakamtopla(sayı));
    }
    private static int rakamtopla(int sayı) {
        int toplam=0;
        while (sayı>0){
            toplam+=sayı%10;
          sayı/=10;
        }return toplam;
    }
}
