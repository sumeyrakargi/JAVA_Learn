package J03_ScannerClass.tasks3;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner sc=new Scanner(System.in);
        System.out.println("İller arası mesafeyi giriniz : ");
        int a=sc.nextInt();

        Scanner in=new Scanner(System.in);
        System.out.println("Ortalama hızı giriniz : ");
        int b=sc.nextInt();

        System.out.println("Varış süresi : "+(a/b)+"saattir." );


    }
}
