package j36_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {
    public static void main(String[] args) {

        HashMap<String,String> hm=new HashMap<>();
    // map.containsKey();--> girilen Key değerinin map de varlığını kontrol eder ve boolean return eder.
    // map.containsValue();--> girilen value  değerinin map de varlığını kontrol eder ve boolean return eder.

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediaMarkt","183 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.containsKey(\"Amazon\") = " + hm.containsKey("Amazon"));//true
        System.out.println("hm.containsKey(\"amazon\") = " + hm.containsKey("amazon"));//false
        System.out.println("hm.containsValue(\"111 Euro\") = " + hm.containsValue("111 Euro"));//true
        System.out.println("hm.containsValue(\"100 Tl\") = " + hm.containsValue("100 Tl"));//false


    }}
