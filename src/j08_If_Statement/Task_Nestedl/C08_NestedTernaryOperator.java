package j08_If_Statement.Task_Nestedl;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("ürün miktarını giriniz.");
        int a= sc.nextInt();
        System.out.println("Birim fiyatı giriniz");
        int b= sc.nextInt();

        System.out.println(a>100? (a*b*0.67):(a*b));




    }
}
