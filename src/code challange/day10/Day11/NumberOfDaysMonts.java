package Day11;

import java.time.LocalDate;

import java.util.Scanner;

public class NumberOfDaysMonts {

    /*
    Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
    INPUT:
    Ay Numarasi:
    2
    Yil :
    2016
    OUTPUT :
    Subat 2016 29 Gundur.
     */
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Yıl giriniz :");
        int yil = sc.nextInt();
        System.out.println("Ay bilgisini giriniz : ");
        int ay = sc.nextInt();
        LocalDate trh = LocalDate.of(yil, ay,1);
        System.out.println(trh.getMonth() + " " + trh.getYear() + " " + trh.lengthOfMonth() + "days");

        //MARCH 2022 31days
    }
}
