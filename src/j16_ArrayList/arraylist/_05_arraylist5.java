package j16_ArrayList.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        ArrayList<String> list2 = new ArrayList<>();
        rotateList(list,list2);
    }
    private static void rotateList(ArrayList<String> a,ArrayList<String> b) {

             for(int i = a.size()-1 ; i>=0 ; i--) {
                 b.add(a.get(i));
             }
             System.out.println(b);
    }}

