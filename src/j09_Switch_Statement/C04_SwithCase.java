package j09_Switch_Statement;

import java.util.Scanner;

public class C04_SwithCase {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Bir ay giriniz :");
        int ay = sc.nextInt();

        switch (ay) {
            case 12:
            case 1:
            case 2:
                System.out.println("mevsim Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("mevsim İlkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("mevsim Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("mevsim Sonbahar");
                break;
            default:
                System.out.println("Yanlış veri girdiniz.");

        }
    }
}