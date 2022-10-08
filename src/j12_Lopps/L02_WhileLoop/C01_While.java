package j12_Lopps.L02_WhileLoop;

import java.util.Scanner;

public class C01_While {
    public static void main(String[] args) {



        /*
        Başlangıç ve bitiş değerleri net olan tekrarlarda foor loop ,
        ama adım sayısı belli olmayıp bir şarta yada duruma bağlı olan tekrarlarda while loop kullanılır
         */
        //Task 01-->11 den 20 ye kadar

        int başla=11;
        while (başla<21){
            System.out.println(başla);
            başla++;
        }

        //Task 02--> 7 kere javaCAN print eden code create ediniz.

        int i=1;
        while (i<8){
            System.out.println("javaCAN");
            i++;
        }
        //TAsk 03-->iki basamaklı tek sayıları yazdırınız
        int a=11;
        while (a<100 ){
            System.out.println(a+" ");
            a+=2;
        }
        //TAsk 04-->
        Scanner sc=new Scanner(System.in);
        System.out.println( "bir metin giriniz");
        String metin=sc.nextLine();
        int x=metin.length()-1;//metnin son karakteri
        while (x>=0 ){
            System.out.print(metin.charAt(x));
            x--;
        }
        //Task 05 girilen sayıya kadar olan sayıların toplamını creat eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println( "bir sayı giriniz");
       int sayı=sc.nextInt();

       int toplam=0;
        while (0<=sayı ){
            toplam+=sayı;
            sayı--;
        } System.out.println("Girdiğin sayıların toplamı :"+toplam);

        //task 06 9 faktoriyel bulun
        Scanner s=new Scanner(System.in);
        System.out.println( "bir sayı giriniz");
        int sa=sc.nextInt();
        int faktoryl=1;
        while (sa>=1){
            faktoryl*=sa;
                    sa--;
         System.out.println(faktoryl);}












    }//main sonu
}
