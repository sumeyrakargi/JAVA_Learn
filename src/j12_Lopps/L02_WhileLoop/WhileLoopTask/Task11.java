package j12_Lopps.L02_WhileLoop.WhileLoopTask;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

        Scanner scan = new Scanner(System.in);
        int k;
        int adet=0;
        int toplam=0;
        do {
            System.out.print("lütfen bir sayı giriniz: ");
            k = scan.nextInt();
            System.out.println("Olmadı");
            toplam+=k;
            adet++;
        } while (k != 0);
        System.out.println(adet+" adet sayı girilmiştir"+"\nBu sayıların toplamı :"+toplam);









    }
}
