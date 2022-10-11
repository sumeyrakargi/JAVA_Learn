package j14_scoope.HaftanıTaski;

import java.util.Scanner;

public class Topzıplatma {

      /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */
      public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          System.out.print("Topu bıraktığınız yüksekliği giriniz: ");
          double yükseklik = sc.nextDouble();
          double zıplamayüksekliği=yükseklik;
          int zıplamasayısı=0;
          double toplamyol=yükseklik;

          while (true)

              if (zıplamayüksekliği>1){
                  zıplamayüksekliği*=0.75;
                  zıplamasayısı++;
                  toplamyol+=zıplamayüksekliği*2;
              }else break;
          System.out.print("top"+ zıplamasayısı+" kere zıplamış ve "+toplamyol+" metre yol almıştır");
      }}
/*
Scanner input = new Scanner(System.in);
        System.out.print("Enter the height in meters to drop the ball : ");
        double height = input.nextDouble();
        double distance = 0;
        int numberofBounce = 0;

        do {
            distance+=height;
            numberofBounce++;
            height*=0.75;
            distance+=height;
        } while (height>=1);

        System.out.println("Your ball has traveled "+distance+ " meters.");
        System.out.println("Your ball has bounced off the ground "+numberofBounce+ " times.");
 */