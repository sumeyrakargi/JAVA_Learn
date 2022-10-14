package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {

        //contains();-->istenen elemanın varlığını kontrol ederek true/fals return eder

        ArrayList<String> listşehir=new ArrayList<>(List.of("Münih","losAngles","Bursa","Londra","samsun","istanbul"));

        System.out.println("listşehir.contains(\"Münih\") = " + listşehir.contains("Münih"));//true
        System.out.println("listşehir.contains(\"diyarbakır\") = " + listşehir.contains("diyarbakır"));//false
        System.out.println("listşehir.contains(\"münih\") = " + listşehir.contains("münih"));//false

    }
}
