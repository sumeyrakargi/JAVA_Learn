package j13_BreakContinue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {
        //Task

        Scanner sc = new Scanner(System.in);
        System.out.print("String  giriniz : ");
        String str = sc.nextLine();

        int a=str.length();
        int asayısı=0;

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='a'){
           asayısı++;
            }else if (ch=='c') {
                break;
            }System.out.print(ch);
           }
        System.out.println("\na sayısı "+asayısı+" tanedir.");
    }}

