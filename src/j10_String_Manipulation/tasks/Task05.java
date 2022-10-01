package j10_String_Manipulation.tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        /* Task->
     Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
      */


        Scanner sc=new Scanner(System.in);
        System.out.println("Adınızı  giriniz");
        String ad= sc.next();
        System.out.println("soyadınızı giriniz");
        String soyad=sc.next();

        System.out.println("Ad - Soyad : "+ad.toUpperCase().charAt(0)+ad.substring(1)+" "+
                soyad.toUpperCase().charAt(0)+soyad.substring(1));

    }
}
