package j09_Switch_Statement;

import java.util.Scanner;

public class C02_SwitchCase {

    public static void main(String[] args) {
        // TASK-> Kullanıcının girdiği yılı ay sırasına göre ayın ismini print eden code create edinz

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir ay giriniz :");
        int ay = sc.nextInt();

        switch (ay) {
            case 1:
                System.out.println("girilen ay Ocak");
                break;
            case 2:
                System.out.println("girilen ay Şubat");
                break;
            case 3:
                System.out.println("girilen ay Mart");
                break;
            case 4:
                System.out.println("girilen ay Nisan");
                break;
            case 5:
                System.out.println("girilen ay Mayıs");
                break;
            case 6:
                System.out.println("girilen ay Haziran");
                break;
            case 7:
                System.out.println("girilen ay Temmuz");
                break;
            case 8:
                System.out.println("girilen ay Ağustos");
                break;
            case 9:
                System.out.println("girilen ay Eylül");
                break;
            case 10:
                System.out.println("girilen ay Ekim");
                break;
            case 11:
                System.out.println("girilen ay Kasım");
                break;
            case 12:
                System.out.println("girilen ay Aralık");
                break;
            default:
                System.out.println("Yanlış veri girdiniz.");


        }
    }
}