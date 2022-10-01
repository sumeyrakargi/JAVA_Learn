package J03_ScannerClass.tasks3;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Boyunuzu giriniz (cm) :" );
        int boy=sc.nextInt();

        Scanner in=new Scanner(System.in);
        System.out.println("Kilonuzu giriniz (kg) :" );
        int kilo=sc.nextInt();


        System.out.println("VKE:" + kilo/(boy*0.01*boy*0.01));
    }
}
