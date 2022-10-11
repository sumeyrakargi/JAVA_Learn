package j12_Lopps.L02_WhileLoop.WhileLoopTask;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("1.sayıyı girin");
        int sayı1 = sc.nextInt();
        System.out.println("2.sayıyı girin");
        int sayı2 = sc.nextInt();

        System.out.println("*** For ***");

        for (int i =( sayı1 < sayı2 ? sayı1 : sayı2)+1; i < (sayı1 > sayı2 ? sayı1 : sayı2); i++) {
            System.out.print(i + " ");

        }
        System.out.println();

        System.out.println();

        System.out.println("*** While ***");
        int k=Math.min(sayı1,sayı2);
        while (k<Math.max(sayı1,sayı2)){
            System.out.print(k+" ");
            k++;
        }
        System.out.println();

    }
}
