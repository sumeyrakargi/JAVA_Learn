package j15_Arrays;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("kaç elemanlı array istersiniz : ");

        int arr[]=new  int[sc.nextInt()];
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+ ". index elemanı giriniz :");

            toplam+=arr[i];
        }
        int ortalama=toplam/arr.length;
        int ortalamayıgecnelemn=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>ortalama){
                ortalamayıgecnelemn++;
            } }System.out.println("Girilen sayıların ortalaması "+ ortalama+" ortalamayı geçen eleman sayısı "+ortalamayıgecnelemn);
        }}

