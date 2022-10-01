package j10_String_Manipulation.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

        //Girilen s



        Scanner sc=new Scanner(System.in);
        System.out.println("string giriniz");
        String str= sc.next();

        System.out.println("index belirtiniz");
        int a=sc.nextInt();

        if (str.length()>a)
            System.out.println(str.charAt(a));
        else System.out.println("girilen index string indexinden fazla");

    }
}
