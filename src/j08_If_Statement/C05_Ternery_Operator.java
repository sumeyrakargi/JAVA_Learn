package j08_If_Statement;

import java.util.Scanner;

public class C05_Ternery_Operator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz.");
        int a= sc.nextInt();

        /*
        ahan da TRICK -> ternary iki durum(T/F) için farklı data type çıktısı veriyorsa variable atama yapmadan sout yapılmalı
        ya da ternary çıktısı aynı data type serializable edilmeli...

         */

        System.out.println(a%2==0?a/2:"girilen sayı tek sayı olduğu için yarısı tam sayı değildir.");
    }

}
