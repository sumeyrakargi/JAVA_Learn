package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {

        //remove();--> listten istenen eleanı siler

        ArrayList<String> listşehir=new ArrayList<>(List.of("Münih","losAngles","Bursa","Londra","samsun","istanbul"));
        System.out.println(listşehir.remove(3));//Londra
        System.out.println( listşehir); //[Münih, losAngles, Bursa, samsun, istanbul]
        System.out.println(listşehir.remove("Münih"));//true
        System.out.println(listşehir.remove("bolu"));//false
        System.out.println(listşehir);//[losAngles, Bursa, samsun, istanbul]
        //System.out.println(listşehir.remove(11));//RTE verir olmayan index
        listşehir.add("Münih");
        listşehir.add("Londra");
        listşehir.add("Munih");
        System.out.println(listşehir);//[losAngles, Bursa, samsun, istanbul, Münih, Londra, Munih]
        System.out.println(listşehir.remove("Münih"));//true-->ilk sıradakini siler
        System.out.println(listşehir);//[losAngles, Bursa, samsun, istanbul, Londra, Munih]

        ArrayList<String> listülke=new ArrayList<>(List.of("Amerika","Almanya","Turkiye"));
        listşehir.addAll(listülke);// arraylist a array list eklenirken addAll
        System.out.println(listşehir);//[losAngles, Bursa, samsun, istanbul, Londra, Munih, Amerika, Almanya, Turkiye]
        listşehir.removeAll(listülke);// arraylistten bir array list remove edilirken removeAll
        System.out.println(listşehir);//[losAngles, Bursa, samsun, istanbul, Londra, Munih]

    }
}
