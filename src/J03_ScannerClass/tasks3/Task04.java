package J03_ScannerClass.tasks3;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Adınız : ");
        String ad= sc.next();

        Scanner s=new Scanner(System.in);
        System.out.println("Soyadınız : ");
        String sad= sc.next();

        Scanner n=new Scanner(System.in);
        System.out.println("Yaşınız : ");
        int yas= sc.nextInt();

        Scanner in=new Scanner(System.in);
        System.out.println("Kilonuz : ");
        int kg= sc.nextInt();

        Scanner i=new Scanner(System.in);
        System.out.println("Boyunuz : ");
        int boy= sc.nextInt();

        Scanner ss=new Scanner(System.in);
        System.out.println("Üyelik süresi (ay): ");
        int süre= sc.nextInt();

        System.out.println(ad+" "+sad+" "+yas+" "+kg+" "+boy+" "+süre+" "+"Toplam ücret: "+20*süre+" usd");
    }

}
