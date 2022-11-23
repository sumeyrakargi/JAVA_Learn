package j36_Map.j36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {

    public static void main(String[] args) {

       /*
       TreeMap-->
       1-TreeMap key lerde null değer kabul etmez fakat value larda null değer tanımlanabilir.
       2-TreeMap elemanlarını key natural order a göre tanımlar.
       3-TreeMap synchronized ve thread safe değildir.
       4-TreeMap en yavaş map türüdür.Kullanırken çoook dikkat edilmeli.
        */

        TreeMap<Integer,String> tm= new TreeMap<>();
        tm.put(101,"Umut");
        tm.put(102,"Murat");
        tm.put(103,"UMit");
        tm.put(104,"Adem");
        tm.put(105,"Yusuf");
        System.out.println("tm = " + tm);//tm = {101=Umut, 102=Murat, 103=UMit, 104=Adem, 105=Yusuf}
        //tm.put(null,"Sumeyra");.NullPointerException--> key değeri null olamaz
        tm.put(1001,null);
        System.out.println("tm = " + tm);//tm = {101=Umut, 102=Murat, 103=UMit, 104=Adem, 105=Yusuf, 1001=null}


        HashMap<String, String> hm = new HashMap<>();

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);
        TreeMap<String, String> tm1 = new TreeMap<>(hm);//hm TreeMap e atanarak convert edildi
        //TreeMap<String, String> tm2 = hm;//CTE->dataType miss-Match
        System.out.println("tm1 = " + tm1);//{Amazon=296 Euro, Apple store=333 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Saturn=300 Euro, Vatan=111 Euro}
        System.out.println("tm.ceilingKey(103) = " + tm.ceilingKey(103));//103 ceilingKey(103);->method parametre olarak girilen key değer map'de varsa return eder
        // yoksa parametreden buyuk en kuçuk key değerini return eder.
        //parametre map'de yok ve parametreden buyuk en kucuk  key de yoksa null return eder
        //ceilingKey(key)-> en kucuk abi-abla
        System.out.println("tm.ceilingKey(108) = " + tm.ceilingKey(108));//null
        System.out.println("tm.ceilingKey(1) = " + tm.ceilingKey(1));//101-> 1'den buyuk en kucuk key 101
        System.out.println("tm.ceilingKey(110) = " + tm.ceilingKey(110));//null -> 110 dan b uyuk en kucuk key yok

        //ascending order--> artan sıralama
        //descending order--> azalan sıralama

        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());//[1001, 105, 104, 103, 102, 101]
        System.out.println("tm.keySet() = " + tm.keySet());// [101, 102, 103, 104, 105, 1001]
        System.out.println("tm.firstKey() = " + tm.firstKey());//101
        System.out.println("tm.lastKey() = " + tm.lastKey());//1001
    }
}
