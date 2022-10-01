package j09_Switch_Statement;

import java.util.Scanner;

public class C06_SwitchCase {

    public static void main(String[] args) {
        //TASK--> Girilen haftanın gününü hafta içi hafta sonu olup olmadığını print eden code yazınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir gün giriniz : ");
        String gün = sc.next().toLowerCase();// Pazar girilse bile girilen büyük karakteler küçük harfe atanır.

        switch (gün) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Hafta içi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Yanlış veri girdiniz.");

    }
}}
