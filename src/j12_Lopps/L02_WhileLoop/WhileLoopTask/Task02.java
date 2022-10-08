package j12_Lopps.L02_WhileLoop.WhileLoopTask;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task 02-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayı1=sc.nextInt();
        System.out.println("İkinci bir sayı giriniz");
        int sayı2=sc.nextInt();

       int toplam=0;

       for (int i=sayı1;i<sayı2;i++){
           toplam+=i;
        }
        System.out.println(toplam);



    }
}
