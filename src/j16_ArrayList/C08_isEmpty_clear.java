package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty_clear {
    public static void main(String[] args) {
        // isEmptyt()-->listenin boş olmasını kontrol eder true/false return eder
        // clear(),--> listin tüm elemanlarını siler

        ArrayList<String> listşehir=new ArrayList<>(List.of("Münih","losAngles","Bursa","Londra","samsun","istanbul"));
        System.out.println(listşehir.isEmpty());//false   list boşluğu kontrol edildi
        listşehir.clear();
        System.out.println(listşehir);// []     temizlendikten sonra
        System.out.println(listşehir.isEmpty());// true


    }
}
