package j11_Method_Creation;

import java.util.Scanner;

public class Task02 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Adınızı giriniz : ");
        String ad= sc.nextLine();

        System.out.print("ASoyadınızı giriniz : ");
        String soyad= sc.nextLine();
        büyüt(ad,soyad);

    }

  public static void büyüt(String a,String b){
      System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));
  }



}
