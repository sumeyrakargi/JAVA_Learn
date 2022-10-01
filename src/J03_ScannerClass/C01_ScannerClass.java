package J03_ScannerClass;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {

        // kullanıcıdan veri almak içinn şu adım takip edilir
        //1. adım-> Scanner class'dan obj create edilir.

        //2.adım ->System.out.println("adınızı giriniz :");

        // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.
        //String isim=scan.nextLine();// kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine() methodu ile atandı

        //System.out.println("isim = " + isim);,

        //TASK--> Kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan bir code create ediniz.

      /* Scanner sc=new Scanner(System.in);
        System.out.print("karenin kenarını girini:");
        int kenar=sc.nextInt();
        System.out.println("alan:"+(kenar*kenar)+"cevre;(kenar*4");

         /*
       Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
       Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
       1 seker = 1.7 gr
       Ornek : Input : cay sayisi : 10 seker sayisi :2
         Output : Yilda 12.41 kg seker kullaniyorsunuz


        Scanner sc=new Scanner(System.in);
        System.out.println("günlük içtiğiniz çay miktarını giriniz:");
        int çaysayisi= sc.nextInt();

        System.out.println("şeker sayınızı veriniz:");
        int seker= sc.nextInt();

        System.out.println("yıllık seker tüketiminiz:"+(çaysayisi*seker*1.7*365)/1000+"kg seker tüketiyorsunuz");

              */
        Scanner sc=new Scanner(System.in);
        System.out.println("isminiz giriniz : ");//2. adım
        // char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. index ilk  karakteririni alır
        // System.out.println("isminizin ilk karakteri :" + ch);
        // String isim=sc.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
        String ad = sc.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
        System.out.println("ad = " + ad);
        // System.out.println("isim = " + isim);

    }

    }