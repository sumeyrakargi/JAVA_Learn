package j10_String_Manipulation;

import java.util.Scanner;

public class
C09_Replace_ReplaceAll {

    public static void main(String[] args) {


        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini (update -set) saglar. Sonuc String'dir..
         */
        String str="javaCAN'lara selam olsun java ile bolcana offer";//j@v@CAN'l@r@ sel@m olsun j@v@ ile bolc@n@ offer
        System.out.println(str.replace('a','@'));//javaCAN'lara selam olsun java ile bolkana offer
        System.out.println(str.replace("can","kan"));//j@vaCAN'lara selam olsun java ile bolcana offer

        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */
        System.out.println(str.replaceFirst("a","@"));

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        str="javaCAN'lara selam olsun :) java ile 123455655 offer";
        System.out.println(str.replaceAll("\\s","+"));//javaCAN'lara+selam+olsun+:)+java+ile+123455655+offer
        System.out.println(str.replaceAll("\\S","+"));//++++++++++++ +++++ +++++ ++ ++++ +++ +++++++++ +++++
        System.out.println(str.replaceAll("\\w","+"));//+++++++'++++ +++++ +++++ :) ++++ +++ +++++++++ +++++
        System.out.println(str.replaceAll("\\W","+"));//javaCAN+lara+selam+olsun++++java+ile+123455655+offer
        System.out.println(str.replaceAll("\\d","+"));//javaCAN'lara selam olsun :) java ile +++++++++ offer
        System.out.println(str.replaceAll("\\D","+"));//+++++++++++++++++++++++++++++++++++++123455655++++++

        Scanner sc= new Scanner(System.in);
        System.out.println("isminizi giriniz:");
        String isim= "Yusuf";
        String soyad= "Yanar";
        String kartno="1234567891011126";

        String yeniisim=isim.charAt(0)+isim.substring(1).replaceAll("\\w","*");
        String yenisoyad=soyad.charAt(0)+isim.substring(1).replaceAll("\\w","*");
        String yenikartno="**** **** **** ****"+ kartno.substring(12);
        System.out.println("İsim-soyisim :" +yeniisim+" "+yenisoyad +"kart no:" +yenikartno);









    }
}
