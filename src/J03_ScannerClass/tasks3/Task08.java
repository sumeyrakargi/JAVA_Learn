package J03_ScannerClass.tasks3;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */


        Scanner sc=new Scanner(System.in);
        System.out.println("İlk vize notunuzu giriniz.: ");
        int v1= sc.nextInt();

        Scanner i =new Scanner(System.in);
        System.out.println("İkinci vize notunuzu giriniz.: ");
        int v2= sc.nextInt();

        Scanner n =new Scanner(System.in);
        System.out.println("Final notunuzu giriniz.");
        int fnl= sc.nextInt();

        System.out.println("Notunuz:"+ ((((v1+v2)/2)*0.3)+(fnl*0.7)));


    }
}
