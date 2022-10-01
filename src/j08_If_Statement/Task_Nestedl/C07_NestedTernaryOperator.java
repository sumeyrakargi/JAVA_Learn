package j08_If_Statement.Task_Nestedl;

import java.util.Scanner;

public class C07_NestedTernaryOperator {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("bir tamsayı giriniz.");
        int a= sc.nextInt();

        System.out.println((a > 999 && a < 10000) ? "4 Basamaklı" : a % 2 == 0 ? "4 basamaklı olmayan çift sayı" : "4 basamaklı olmayan tek sayı");


    }


}
