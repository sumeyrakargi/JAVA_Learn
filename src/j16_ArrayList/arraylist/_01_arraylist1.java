package j16_ArrayList.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {

        ArrayList List = new ArrayList(Arrays.asList("Banana", "Peach","Apple", "Strawberry", "Kiwi", "Orange","Apple"));
        String fruit="Apple";
        System.out.println(getCount(List, fruit));
        getCount(List, fruit);

    }private static Integer getCount(ArrayList<String>list,String b) {
      int count=0;
        for (String a : list) {
            if (a.equals(b)) {
                count++;
            }
        }return count;
    }
}
