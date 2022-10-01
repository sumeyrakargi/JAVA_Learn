package j11_Method_Creation.taskmethod;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
     */
        Scanner sc=new Scanner(System.in);
        System.out.println("Email adresinizi giriniz");
        String email=sc.nextLine();


        System.out.println(kontrol(email));
    }

    public static boolean kontrol(String email){
        boolean geçerlimi ;

       if ((email.contains("@"))  && (email.contains("."))  &&  (email.indexOf("@")>0)) {
           geçerlimi=true;

        }else {
            geçerlimi=true;
        }
        return geçerlimi;
    }

}
