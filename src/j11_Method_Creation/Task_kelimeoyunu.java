package j11_Method_Creation;

import java.util.Scanner;

import static j11_Method_Creation.Task04Atm.karar;

public class Task_kelimeoyunu {

    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
     *        kazandigini yazip oyunu bitirin
     *
     * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */
       static Scanner sc=new Scanner(System.in);
       static int puan1=0;
       static int puan2=0;
       static String kelime;
       static String cvp;

       public static void main(String[] args) {
           System.out.println( "--->Kelime Oyunu Başlıyor<---");
           basla();
       }

       public static void basla(){

           System.out.println("1.Oyuncu--> Bir kelime giriniz.");
           kelime =sc.nextLine();
           System.out.println("2.Oyuncu-->Girilen kelimeyi kabul ediyor musunuz? E/H");
           String cvp=sc.next().toUpperCase();
           if (cvp.equals("E")) {
               System.out.println("puanınız=" + (puan1 += kelime.length()));
               oyna();

           } else if (cvp.equals("H")) {

               System.out.println("kaybettiniz");
           } else{ System.out.println("gecersiz harf girdiniz");}
       }
       public static void oyna() {
           Scanner sc = new Scanner(System.in);
           System.out.println("Sıradaki Oyuncu--> Bir kelime giriniz.");
           String kelime2 = sc.nextLine();
           System.out.println("Girdiğiniz kelime başa mı eklensin sona mı ? B/S");
           String ekleme = sc.nextLine().toUpperCase();
           switch (ekleme) {
               case "B":
                   kelime = kelime2 + kelime;
                   puan2 = puan2 + kelime2.length();
                   System.out.println(kelime + " puanınız:" + puan2);
                   break;
               case "S":
                   kelime = kelime + kelime2;
                   puan2 = puan2 + kelime2.length();
                   System.out.println(kelime + " puanınız:" + puan2);
                   break;
               default:
                   System.out.println("yanlış");}

           karar();}
    public static void karar(){
              Scanner sc=new Scanner(System.in);
               System.out.println("oyuna devam etmek istiyor musunuz? E/H");
               String c = sc.nextLine();
               switch (c) {
                   case "e":
                       basla();
                       break;
                   case "h":
                       System.out.println("--Oyun Bitti--");
                       break;
                   default:
                       System.out.println("Yanlış giriş yaptınız") ;
               karar();}



           }


       }
