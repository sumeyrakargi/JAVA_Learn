package j16_ArrayList.arraylist;

import java.util.*;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */
   static ArrayList<String> colorlist = new ArrayList<String>(List.of("yellow" ,"pink","brown", "red" , "blue" , "red" , "blue"));
    public static void main(String[] args) {
        String  s1="blue";
        String  s2="yellow";
        changeInArraylist(s1, s2);
    }private static void changeInArraylist(String a, String b) {
        Collections.replaceAll(colorlist,a,b);
        System.out.println(colorlist);

    }
}
