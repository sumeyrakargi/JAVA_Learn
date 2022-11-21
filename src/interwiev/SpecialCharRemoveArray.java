package interwiev;

import java.util.ArrayList;
import java.util.Arrays;

public class SpecialCharRemoveArray {
    /*
Problem Tanımı :
getSum isminde bir method oluşturun.
Parametresi ArrayList'tir.
Dizideki tüm $ ları kaldır ve tüm sayıları topla
return yaptğımız veri tipi 'int' olmalıdır.
sonuç 0'dan küçükse, -1 yazdırın.

Örnek1:
ArrayList = $13, $15, $20
Cevap = 48 olmalı

Örnek 2 :
ArrayList= $-13, $0, $0
Cevap = -1 olmalı.
 */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("$13","$15", "$20"));
        getSum(list);
    }public static void getSum(ArrayList<String> list) {
        int toplam=0;
        for(String a : list) {
            toplam += Integer.parseInt(a.replace("$", ""));
        }
        System.out.print(toplam<0? -1 : toplam);
    }
}
