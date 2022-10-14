package j15_Arrays.ArraysEasyTasks.odev;

import java.util.Scanner;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int num= sc.nextInt();//369
        String[] smyr = String.valueOf(num).split("");
        for (int i = smyr.length-1; i >=0; i--) {
            System.out.print(smyr[i]);//963
        }}
    }



