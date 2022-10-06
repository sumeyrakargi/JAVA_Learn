package j12_Lopps.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
     Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı girin");
        int sayı=sc.nextInt();


        for (int a=1; a<=sayı;a++){
            for (int b=1;b<=sayı;b++){
                System.out.print(a==b?"1 ":"0 ");
            }
            System.out.println();
        }
    }
}
