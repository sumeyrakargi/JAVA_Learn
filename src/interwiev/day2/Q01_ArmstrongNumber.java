package interwiev.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01_ArmstrongNumber {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(254);
        numbers.add(651);
        numbers.add(407);
        numbers.add(932);

        for (int i = 0; i < numbers.size(); i++) {
            if (armstrong(numbers.get(i)) == numbers.get(i)) {
                System.out.println(numbers.get(i) + " bir armstrong sayıdır");
            } else System.out.println(numbers.get(i) + " bir armstrong sayı değildir");
        }

       /* soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
        gösteren program yazınız

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number please");
        int number = sc.nextInt();

        for (int i = 0; i <= number; i++) {
            if (armstrong(i) == i) {
                System.out.println(i + " bir armstrong sayıdır");
            } else System.out.println(i + " bir armstrong sayı değildir");
        }

    }


    private static void armstrong(int num) {
        Scanner scan = new Scanner(System.in);
        int basamak_sayisi = 0, rakam;
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        num = scan.nextInt();
        while (num > 0) {
            num /= 10;
            basamak_sayisi++;
        }
        while (num > 0) {
            rakam = num % 10;
            toplam += Math.pow(rakam, basamak_sayisi);
            num /= 10;
        }
        if (toplam == num) {
            System.out.println(num + " sayisi armstrong bir sayidir.");
        } else {
            System.out.println(num + " sayisi armstrong bir sayi degildir.");
        }

    }  */
    }
