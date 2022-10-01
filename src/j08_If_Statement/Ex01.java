package j08_If_Statement;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        /*
        Task 1
        Girilen bir sayının negatif ve pozitifliğini kontrol eden code create edin
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("agam bir sayi gir : ");
        int sayi = sc.nextInt();

        if (sayi > 0) {//sayinin sıfırdan buyuk olması şarta baglandı
            System.out.println("girilen sayi pozitif");
        } else if (sayi < 0) {//sayinin sıfırdan buyuk olmaması halinde sıfırdan kucuk olamsı sarta baglandı
            System.out.println("girilen sayi negatif");
        } else {//syının sıfırdan buyuk veya kucuk olmaması halıinde kalan durum(sıfıra eşit olması) şarta bağlandı
            System.out.println("girilen sayi ne negatif  ne de pozitifdir yani nötr'dür");
        }

        /*
          Kullanicidan 100 uzerinden notunu isteyin.
          Not'u harf sistemine cevirip yazdirin.
          50’den kucukse "D",
          =50  <60 arasi "C",
          =60  <80 arasi "B",
          =80’nin uzerinde ise "A"

        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not = sc.nextInt();
        if (not<0 || not>100) System.out.println("not 0 dan küçük 100 den büyük olamaz");
        else if (50>not) System.out.println("D");
        else if (not<60) System.out.println("C");
        else if (not<80) System.out.println("B");
        else System.out.println("A");   */

        //Scanner sc = new Scanner(System.in);
        //System.out.println("agam notunu  gir : ");
        //int not = sc.nextInt();
        // if (not<0 || not>100){
        //     System.out.println("agam negatif ve 100 den buyuk not olmaz\nadam gibi bişeyler gir :(\n" +
        //             "gelmiim oraya");
        // }else if (not<50){//50 den kucuk not alma kontrolu
        //     System.out.println("D");//1,2,3..49
        // }else if (not<60){//60 den kucuk not alma kontrolu
        //     System.out.println("C");
        // }else if (not<80){//80 den kucuk not alma kontrolu
        //     System.out.println("B");//60,61,...79
        // }else {//80 ve buyuk    not alma kontrolu
        //     System.out.println("A");//80,81...1000
        // }





        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not = sc.nextInt();
        if (not<0 || not>100) System.out.println("not 0 dan küçük 100 den büyük olamaz");
        else if (50>not) System.out.println("D");
        else if (not<60) System.out.println("C");
        else if (not<80) System.out.println("B");
        else System.out.println("A");

        }


    }

