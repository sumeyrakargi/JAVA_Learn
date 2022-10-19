package j16_ArrayList.Tasks1;

import java.util.ArrayList;
import java.util.Scanner;


 public class Task08 {

     static ArrayList<Integer> sayılar = new ArrayList<>();

     public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        int i = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Sayı giriniz /çıkmak için <0> :");
            double sayı = sc.nextDouble();
            if (sayı == 0)
                break;
            sayılar.add((int)sayı);
        } System.out.println(sayılar);
        ortalamadanbuyuk(sayılar);
    }private static void ortalamadanbuyuk (ArrayList<Integer>sayı) {
        ArrayList<Integer>ortalamaustu = new ArrayList<>();
        double toplam = 0;
            for (int i = 0; i <sayı.size(); i++) {
                toplam += sayı.get(i);
            }double ortalama = toplam /sayı.size();
            for (int i = 0; i < sayı.size(); i++) {
                if (sayı.get(i)>ortalama){
                    ortalamaustu.add(sayı.get(i));
                }}System.out.println(ortalamaustu);
    }}
