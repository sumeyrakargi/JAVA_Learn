package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_İndexOf {
    public static void main(String[] args) {
        //index=f()-->list içinde istenen elemanın index değerini return eder

        ArrayList<String> listülke=new ArrayList<>(List.of("Amerika","Almanya","Turkiye"));
        ArrayList<String> listşehir=new ArrayList<>(List.of("Münih","losAngles","Bursa","Londra"));

        System.out.println(listşehir.indexOf("Londra"));//3
        System.out.println(listşehir.indexOf("avrupa"));//-1  olmayan elaman -1 return eder.

        listülke.add("Amerika");
        System.out.println("listülke = " + listülke);//[Amerika, Almanya, Turkiye, Amerika]
        System.out.println(listülke.indexOf("Amerika"));//0 --> amerika iki kez tekrar etsede ilk bulunanın indexini return eder
        System.out.println(listülke.lastIndexOf("Amerika"));//3 sondan ilk elemanın indexini verir

    }
}
