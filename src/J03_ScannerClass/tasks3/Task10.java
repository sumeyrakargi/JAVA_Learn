package J03_ScannerClass.tasks3;

import java.util.Scanner;

public class Task10 {


    public static void main(String[] args) {

        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

        // c = (f-32)*5/9

        Scanner sc=new Scanner(System.in);
        System.out.println("Hava sıcaklığını F cinsinden giriniz: ");
        int F= sc.nextInt();

        System.out.println("Hava sıcaklığı : "+(((F-32)*5)/9)+" C dir");

    }








}
