package j10_String_Manipulation.tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.


        Scanner sc= new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String kelime= sc.next();
        System.out.println(kelime.contains(""));

    }
}

