package j36_Map;

import java.util.HashMap;

public class C08_replace {
    public static void main(String[] args) {

        HashMap<String,String> hm=new HashMap<>();
        // map.replace();--> girilen value  değeri ilgili Key de update edilir return eder.

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediaMarkt","183 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.replace(\"Amazon\",\"314 Euro\") = " + hm.replace("Amazon", "314 Euro"));//296 Euro-->oldvalue
        System.out.println("hm = " + hm);
        System.out.println("hm.replace(\"sefil\",\"Haluk\") = " + hm.replace("sefil", "Haluk"));//null
    }
}
