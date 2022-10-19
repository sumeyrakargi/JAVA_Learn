package j16_ArrayList.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(9,5,6,3,1,5,2,1,7));
        hillNum(list);

    }
    private static void hillNum(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)< list.get(i-1)&&list.get(i)> list.get(i+1)){
                System.out.print(list.get(i)+" ");
            }}

    }
}
