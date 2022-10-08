package j12_Lopps.L03_DoWhile;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println( "bir sayı giriniz");
        int sayı=sc.nextInt();

        do{
            System.out.println( "kazandınız");
            sayı++;
        }while (sayı<17);
        System.out.println("kaybettiniz");
    }
}
