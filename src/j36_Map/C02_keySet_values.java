package j36_Map;

import java.util.HashMap;

public class C02_keySet_values {
    public static void main(String[] args) {

        HashMap<String,String> hm=new HashMap<>();
        // map.keySet();--> map key değerlerini Set e atayıp return eder.
        // map.values();--> map value değerlerini call. atayıp return eder.

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediaMarkt","183 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());
        System.out.println("-----********-----");

        //task--> hm key ve value satır satır print ediniz.

        for (String k:hm.keySet())
              {
                  System.out.print(k);

        }
        for (String v:hm.values()){
            System.out.print(v);
        }


    }
}
