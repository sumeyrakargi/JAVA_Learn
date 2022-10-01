package j11_Method_Creation.taskmethod;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Email adresinizi giriniz");
        String email=sc.nextLine();




        if ((email.contains("@"))  && (email.contains(".")) && (email.indexOf("@")>0)  ) {
            System.out.println(true);
        }else {
            System.out.println(false);

        }
    }
}
