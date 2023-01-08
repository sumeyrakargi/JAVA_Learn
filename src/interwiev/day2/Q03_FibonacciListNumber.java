package interwiev.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_FibonacciListNumber {

    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz");
        int num=sc.nextInt();

        int n1=0,n2=1,n3;
        for (int i = 2; i <num ; i++) {//Döngü 2 den başlıyor çünkü ilk 2 terim 0 ve 1 her zaman yazılacak
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        System.out.println();
    }



        /*
        Scanner klavye=new Scanner(System.in);
        System.out.println("Kaç Adet Fibonnacci Sayısı Görmek İstiyorsunuz?");
        int sayi=klavye.nextInt();
        int birinci=0;
        int ikinci=1;
        int ucuncu=birinci+ikinci;

        System.out.println("Fibonacci Sayıları ");
        System.out.print(birinci+ " "+ikinci+ " ");

            while(sayi>0){
            System.out.print(ucuncu+ " ");
            sayi--;
            birinci=ikinci;
            ikinci=ucuncu;
            ucuncu=birinci+ikinci;


          }

    }

         */


    }
}
