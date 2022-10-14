package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_Sort_reverse {
    public static void main(String[] args) {

        //Collections.sort(list);--> verilen list i naturel sıralama yapar
        //Collections.reserve();--> verilen listin ters sıralamasını return eder,

        ArrayList<String> listşehir=new ArrayList<>(List.of("Münih","losAngles","Bursa","Londra","samsun","istanbul"));

        System.out.println(listşehir);//[Münih, losAngles, Bursa, Londra, samsun, istanbul]
        Collections.sort(listşehir);//-->sort() methor sout içinde çalışmaz
        System.out.println(listşehir);//[Bursa, Londra, Münih, istanbul, losAngles, samsun](önce büyük harfle başlayanları sıralaı)
        Collections.reverse(listşehir);//
        System.out.println(listşehir);//[samsun, losAngles, istanbul, Münih, Londra, Bursa]

    }
}
