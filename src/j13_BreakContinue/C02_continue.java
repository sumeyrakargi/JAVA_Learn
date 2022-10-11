package j13_BreakContinue;

import java.util.Scanner;

public class C02_continue {
    public static void main(String[] args) {


        /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz

        Scanner sc = new Scanner(System.in);
        System.out.print("emailinizi  giriniz : ");
        String str = sc.nextLine();

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch==' ')continue;
            System.out.print(ch);

            }
    }}
