package j04_AritmeticOperators.AritmeticOperatorTasks;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Çiftlikteki inek sayısını giriniz :");
        int inek= sc.nextInt();
        System.out.println("Çiftlikteki koyun sayısını giriniz :");
        int koyun= sc.nextInt();
        System.out.println("Çiftlikteki tavuk sayısını giriniz :");
        int tavuk= sc.nextInt();

        System.out.println("Çiftlikteki hayvanların toplam ayak sayısı :"+((inek*4)+(koyun*4)+(tavuk*2)));





    }

}
