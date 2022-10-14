package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

         //Array copy..copyOf(arr,newLength)--> girilen aar in newLenght kadar ilk elemanını copyalar


        int sayi[]={63,21,47,27,35,12,36,31,46,24};
        int yeniArr[]= Arrays.copyOf(sayi,5);
        System.out.println("Sayıdan 5 eleman kopyalanan yeni arr: "+Arrays.toString(yeniArr));

        int nextArr[]= Arrays.copyOfRange(sayi,3,8);
        System.out.println(Arrays.toString(nextArr));

        // Array ı belirli bir eleman ile update etme..fill(arr,value)

        Arrays.fill(sayi,99);// tüm elemanlar 99 oldu
        System.out.println("99 ile fullenmiş hali "+ Arrays.toString(sayi));////[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]

        Arrays.fill(sayi,3,7,33);//3.4.5.6. index elemanlar 33 ile update edildi
        System.out.println("sayı arr'i 3 ile 7 index arası  33 ile full'lenmiş hali : " + Arrays.toString(sayi));//[99, 99, 99, 33, 33, 33, 33, 99, 99, 99]

    }
}
