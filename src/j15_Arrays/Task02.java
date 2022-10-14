package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
         // girilen int array elemanları toplamını print eden code create edin

        Scanner sc = new Scanner(System.in);
        System.out.print("kaç elemanlı array istersiniz : ");


        int arr[]=new  int[sc.nextInt()];
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+ ". index elemanı giriniz :");
            arr[i]= sc.nextInt();
            toplam+=arr[i];
        }
        System.out.println("Girilen sayıların toplamı "+toplam);


    }
}
