package j08_If_Statement;

import java.util.Scanner;

public class C03_Ternary_Operator {
    public static void main(String[] args) {
        /* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz.");
        int a= sc.nextInt();

        System.out.println("   ***  if-else   ***   ");

        if (a%2==0) System.out.println("çift");
        else System.out.println("tek");

        System.out.println("   ***  ternary   ***   ");

        String sonuç= a%2==0?"çift":"tek";
        System.out.println(sonuç);

        System.out.println(a% 2 == 0 ? "agam sayı ÇİFT" : "agam sayi TEK");

        /*
        ahan da TRICK->  ternary operator işlem sonucunda true veya false göre bir cıktı verir.
        eger bu çıktı type göre bir variable atanmazsa sout ile doğrudan print edlimeli.
         */

        //TASK 2 girilen sayının negatif sayı olup olmadığını kontrol eden code create ediniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz.");
        int x= sc.nextInt();

        String sonuc= x<0?"negatif":"pozitif";
        //ya da

        System.out.println(x<0?"negatif":"pozitif");
    }
}
