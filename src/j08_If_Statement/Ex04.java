package j08_If_Statement;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {


        /*
        TASK-->Girilen bir karakterin harf olup olmadığını  kontrol eden code create ediniz.
         */

        Scanner sc=new Scanner(System.in);

        System.out.println("bir karakter giriniz");

        char krktr= sc.nextLine().charAt(0);

        if ((krktr>='A'&&krktr<='Z')||(krktr>='a'&&krktr<='z')) {
            System.out.println("girdiğiniz karakter harftir");
        }else System.out.println("harftir");






















    }

    public static class Ex06 {
    }
}
