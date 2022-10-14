package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("kaç elemanlı array istersiniz : ");
       int arrBoyut=sc.nextInt();
       int arr[]=new  int[arrBoyut];

        for (int i = 0; i <arrBoyut ; i++) {
            System.out.println(i+ ". index elemanı giriniz :");
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));//[52, 32, 79]
        Arrays.sort(arr);//
        System.out.println(Arrays.toString(arr));//[32, 52, 79]

        Arrays.sort(arr);//arr k->b sortingen yapıldı..
        for (int i = arr.length-1 /*-> en buyuk sondaki elemandan döngü başlar*/ ;i>=0; i--) {
            System.out.print(arr[i] + " ");
        }


    }
}
