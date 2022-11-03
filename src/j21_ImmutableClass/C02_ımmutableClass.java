package j21_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C02_ımmutableClass {
    public static void main(String[] args) {
        /*
  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
  BigDecimal, BigInteger java'da immutable sınıflara örnek olarak gösterilebilir.
        Date, StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
 */

        String name="Sumeyra";

        System.out.println(name);//Sumeyra
        name.concat("javacan");
        System.out.println(name.concat("javacan"));//Sumeyrajavacan
        System.out.println("name = " + name);//Sumeyra
        System.out.println(name.substring(0, 2));//su
        System.out.println(name);
        name="su";
        System.out.println(name);//su

        //List<String> isimlist = new ArrayList<String>();
        //isimlist.add("Sumeyra");
        //isimlist.add("Yusuf");
        //isimlist.add("Sumeyra");
        //isimlist.add("Umut");
       //// isimlist.remove(1);
       // isimlist.set(1,"javacan");
        //System.out.println("isimlist = " + isimlist);//[Sumeyra, javacan]
       // if(isimlist.get(2) == isimlist.get(0)){
           // System.out.println(true);}
        //else
            //System.out.println(false);


    }
}
