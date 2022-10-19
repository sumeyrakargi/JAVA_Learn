package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // bir listte istenen sayının varlığını kontrol eden code create ediniz.

        ArrayList<Integer> listsayı=new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        Scanner sc = new Scanner(System.in);
        System.out.println("aradığınız sayıyı giriniz");
        int sayı = sc.nextInt();
        boolean varmı=false;

        for (int i = 0; i <listsayı.size() ; i++) {
            if(listsayı.get(i) == sayı) {
                varmı=true;
                System.out.println("aradığınız sayı mevcut");
                break;
            }}if (!varmı) {
            System.out.println("aradığınız sayı yoktur");
        }

    }
}
