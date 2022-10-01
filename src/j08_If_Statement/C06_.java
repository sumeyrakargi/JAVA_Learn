package j08_If_Statement;

import java.util.Scanner;

public class C06_ {

    /*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
 */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("bir tamsayı giriniz.");
        int a= sc.nextInt();
        System.out.println(a>0?(a<10?"Rakam":"Pozitif sayı"):"Negatif SAyı");




    }
}
