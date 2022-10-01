package j10_String_Manipulation.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {


        /*
           Task->
           Girilen iki kelimeden ilki çift sayıda kaqrakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
           ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
           name1= mehmet
           name2= ahmet
           Print ==> mehahmetmet
           */

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir kelime giriniz.");
        String a= sc.next();
        System.out.println("Bir kelime giriniz.");
        String b= sc.next();

        if (a.length()%2==0) {
            System.out.println(a.substring(0, a.length() / 2) + b + a.substring(a.length() / 2));
        }else {
            System.out.println("kelime 2 kelime 1 e eklenemez.");


    }
}}
