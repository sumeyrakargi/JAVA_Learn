package j12_Lopps.L02_WhileLoop.WhileLoopTask;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner scan = new Scanner(System.in);
        char k;
        do {
            System.out.print("lütfen bir karakter giriniz: ");
            k = scan.next().toLowerCase().charAt(0);
            System.out.println("javaCAN");
        } while (k != 'x');
        System.out.println("jAVATAR");

    }}
