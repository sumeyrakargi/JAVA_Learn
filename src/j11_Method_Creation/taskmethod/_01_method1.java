package j11_Method_Creation.taskmethod;

import java.util.Scanner;

public class _01_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bi sayı giriniz");
        int max= sc.nextInt();
        System.out.println(randomNum(max));
    }
    public static double randomNum(int max){
        double maxs = Math.random() * max;
        return maxs;
    }

}
