package j08_If_Statement;

import java.util.Scanner;

public class C04_Ternary_Operator {

    public static void main(String[] args) {

        // TASK-> girilen bir pozitif tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz.");
        int a= sc.nextInt();

        String sonuç=a>9?"sayı iki veya daha fazla basamaklı":"Sayı tek basamaklı";
        System.out.println(sonuç);




    }
}
