package j10_String_Manipulation.tasks;

import java.util.Scanner;

public class TASk_Man {

    public static void main(String[] args) {



        //TASK-->girilen bir cümlede aranan kelimenin varlığını concate eden bir code create ediniz.turner kullanınız.

        Scanner sc= new Scanner(System.in);
        System.out.println("Bir cümle yazınız.");
        String cumle=sc.nextLine();
        System.out.println("Aradığınız kelimeyi yazınız.");
        String kelime=sc.nextLine();
        System.out.println(cumle.contains(kelime)?"Aradığınız kelime cümle içerisinde geçmektedir.":"Aradığınız kelime cümle içerisinde geçmemektedir.");


        //Task--> girilen email hesabının @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        //gmail.com ile ile bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Email adresinizi giriniz.");
        String email= sc.next();
        if (!email.contains("@gmail.com"))System.out.println("Lütfen gmail hesabı giriniz.");
        else if (email.endsWith("gmail.com")) System.out.println("Hesabınız onaylandı");
        else System.out.println("Lütfen geçerli adres giriniz.");




        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.


        Scanner s= new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String sözcük= sc.next();
        System.out.println(sözcük.contains(""));

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scn= new Scanner(System.in);
        System.out.println("Lütfen üç harfli bir kelime giriniz.");
        String kelme= sc.next();

        if (kelme.length()==3)
            System.out.println(kelme.charAt(0)==kelme.charAt(1)||kelme.charAt(0)==kelme.charAt(2)||kelme.charAt(1)==kelme.charAt(2)?"AYnı harfleri içeriyor":"Aynı harfeleri içermiyor.");

        else System.out.println("Girdiğiniz kelime üç harfli değildir.");




    }
}
