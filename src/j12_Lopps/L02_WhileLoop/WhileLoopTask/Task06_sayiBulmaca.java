package j12_Lopps.L02_WhileLoop.WhileLoopTask;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin


        Random rand = new Random();
        int sayı = rand.nextInt(100);
        int tsayısı = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sayı tahmini giriniz: ");
        int tahmin = scan.nextInt();

        while (tahmin != sayı) {
            if (sayı < tahmin) {
                System.out.println("sayiyi kucult");
            } else {
                System.out.println("sayiyi arttir");
            }
            tahmin = scan.nextInt();
            tsayısı++;
        }
        System.out.println("sayiyi " + tsayısı + " denemede buldunuz.");
    }}







