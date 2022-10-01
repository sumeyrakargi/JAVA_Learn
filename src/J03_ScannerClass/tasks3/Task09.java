package J03_ScannerClass.tasks3;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner sc=new Scanner(System.in);
        System.out.println("a sayısı giriniz: ");
        int a= sc.nextInt();

        Scanner i =new Scanner(System.in);
        System.out.println("b sayısı giriniz.: ");
        int b= sc.nextInt();

        Scanner n =new Scanner(System.in);
        System.out.println("c sayısı giriniz.");
        int c= sc.nextInt();

        System.out.println("Sonuç: "+(((a*a)-(b*b))/(3*c)));

    }
}
