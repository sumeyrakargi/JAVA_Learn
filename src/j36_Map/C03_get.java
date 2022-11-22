package j36_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        // map.get(key);--> girilen key değerlerinin value'sini return eder.


        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediaMarkt","183 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.get(\"Saturn\") = " + hm.get("Saturn"));//300 Euro
        System.out.println("hm.get(\"SEfil haluk\") = " + hm.get("SEfil haluk"));//null,,olmayan key için null return eder
        System.out.println("hm.get(\"12\") = " + hm.get("12"));//null,,key data tipi farketmeksizin olmayanı null return eder.
    }
}
