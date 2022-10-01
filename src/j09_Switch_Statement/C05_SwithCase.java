package j09_Switch_Statement;

import java.util.Scanner;

public class C05_SwithCase {
    public static void main(String[] args) {

        /*
        Bakiye (Başlangıç bakiyesi 1000tl) öğrenme,para yatırma ve çekme,çıkış işlemlerinin yapıldığı
        bir ATM opp. code create ediniz
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi seçiniz. :");
        System.out.println("Bakiye öğrenmek için ->1\nPara yatırmak için->2\nPara çekmek için->3\nÇıkış için->4 ");
        int işlem = sc.nextInt();
        int bakiye = 1000;

        switch (işlem) {
            case 1:
                System.out.println("Bakiyeniz:" + bakiye + "tl");
                break;
            case 2:
                System.out.println("Yatımak istediğiniz miktarı giriniz.");
                int yatırılanmiktar = sc.nextInt();
                bakiye += yatırılanmiktar;
                System.out.println("Bakiyeniz:" + bakiye + "tl");
                break;
            case 3:
                System.out.println("Çekmek istediğiniz miktarı giriniz.");
                int cekilenmiktar = sc.nextInt();
                if (cekilenmiktar>bakiye) {
                    System.out.println("Bakiyeniz yetersizdir");
                }else{
                bakiye -= cekilenmiktar;
                System.out.println("Bakiyeniz:" + bakiye + "tl");}
                break;
            case 4:
                System.out.println("İyi Günler.");
            default:
                System.out.println("Hatalı giriş yaptınız");


        }


    }
}