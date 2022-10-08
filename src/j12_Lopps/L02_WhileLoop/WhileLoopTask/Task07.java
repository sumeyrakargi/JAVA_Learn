package j12_Lopps.L02_WhileLoop.WhileLoopTask;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz

            Scanner sc=new Scanner(System.in);
            int max=0;
            int min=0;

            int tahmin=0;
            while (tahmin<5 ){
                System.out.println("Bir sayı giriniz");
                int sayı=sc.nextInt();
                if (sayı>max){
                    max=sayı;
                }else min=sayı;
                tahmin++;
            }System.out.println("Girilen sayının en büyüğü : "+max);
    }}
