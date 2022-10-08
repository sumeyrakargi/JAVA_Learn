package j12_Lopps.L02_WhileLoop.WhileLoopTask;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayı=sc.nextInt();

        int i=0;
        while (i<=sayı){
            System.out.println(i%2==1?i:" ");
            i++;
        }
    }}
