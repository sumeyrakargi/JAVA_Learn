package j10_String_Manipulation.tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        /*
   Girilen passwordun aşagıdakişartları sağlamasını kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı
 */

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your password.");
        String password= sc.next();

        if ((password.charAt(0)>='A'&&password.charAt(0)<='Z') &&(password.charAt(password.length()-1)>='0'&&
                password.charAt(password.length()-1)<='9')&&(password.length()>=6)) {
            System.out.println("password geçerli");
        }else System.out.println("password geçersiz");


    }
}
