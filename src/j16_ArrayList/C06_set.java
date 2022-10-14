package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {
        //set();--> listin istenen elemanını update eder

        ArrayList<String> listsehir=new ArrayList<>(List.of("Münih","losAngles","Londra","Istanbul"));
        listsehir.set(3,"Ankara");
        System.out.println("listsehir = " + listsehir);//[Münih, losAngles, Londra, Ankara]

        System.out.println(listsehir.set(11,"petagonya"));//olmayan index set edlirse Rte verir

    }
}
