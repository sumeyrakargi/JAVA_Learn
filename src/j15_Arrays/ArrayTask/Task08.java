package j15_Arrays.ArrayTask;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println(i + ". elemanını giriniz");
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print("Tek sayılar"+arr[i] + " ");
            }
        }
    }}
