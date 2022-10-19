package j16_ArrayList.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
        getlength(list);

    }private static void getlength(ArrayList<String> list) {

        for (String a:list){
            System.out.print(a.length()+",");
        }
    }
}