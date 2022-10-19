package j16_ArrayList.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(List.of(3,5,7,9,11,13));
        System.out.println(getsum(num));//48

    }private static Integer getsum(ArrayList<Integer> num) {
        int toplam=0;
        for (Integer x : num) {
            toplam+=x;
        }return toplam;
    }}

