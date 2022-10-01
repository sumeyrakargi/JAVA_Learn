package j09_Switch_Statement;

import java.util.Scanner;

/*
   Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
   Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
   programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
   karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
   ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
   Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
   Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
   çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
   Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

    ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
    */
public class C01_SwitchCase {
    public static void main(String[] args) {

        //TASK-> kullanıcının gridiği rakamı yazı ile print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir rakam giriniz:");
        int rakam = sc.nextInt();

        switch (rakam) {
            case 0:
                System.out.println("girilen rakam Sıfır");
                break;
            case 1:
                System.out.println("girilen rakam Bir");
                break;
            case 2:
                System.out.println("girilen rakam İki");
                break;
            case 3:
                System.out.println("girilen rakam Üç");
                break;
            case 4:
                System.out.println("girilen rakam Dört");
                break;
            case 5:
                System.out.println("girilen rakam Beş");
                break;
            case 6:
                System.out.println("girilen rakam Altı");
                break;
            case 7:
                System.out.println("girilen rakam Yedi");
                break;
            case 8:
                System.out.println("girilen rakam Sekiz");
                break;
            case 9:
                System.out.println("girilen rakam Dokuz");
                break;
            default:
            System.out.println("Yanlış veri girdiniz.");
        }
    }}
