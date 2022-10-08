package j12_Lopps.L02_WhileLoop.WhileLoopTask;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        Task 01-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
         */

        int toplam=0; int sayıadedi=0;
        while (toplam<=333){
            Scanner sc=new Scanner(System.in);
            System.out.println("Bir sayı giriniz");
            int sayı=sc.nextInt();
            toplam+=sayı;
            sayıadedi++;
        }
        System.out.println(sayıadedi+" adet sayı girilmiştir"+"\nBu sayıların toplamı :"+toplam);

    }
}
