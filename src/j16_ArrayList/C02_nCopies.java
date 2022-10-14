package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String> listülke=new ArrayList<>(List.of("Amerika","Almanya","Turkiye"));
        ArrayList<String> listşehir=new ArrayList<>(List.of("Münih","losAngles","Bursa","Londra"));

        //nCopies(int,Obj);-->int elemanlı bir obj den oluşan list ataması yapılyor
        ArrayList<String>yenilist=new ArrayList<>(Collections.nCopies(7,"javaCAN"));
        System.out.println("yenilist = " + yenilist);

        //addAll();--> bir liste diğer listi olduğu gibi ekler

        listülke.addAll(listşehir);// ülkelist sonuna şehir list eklendi

        System.out.println("listülke = " + listülke);//listülke = [Amerika, Almanya, Turkiye, Münih, losAngles, Bursa, Londra]
        listşehir.addAll(3,listülke);//3. index den itibaren ülke listi şehir liste tamamen eklendi
        System.out.println("listşehir = " + listşehir);//[Münih, losAngles, Bursa, Amerika, Almanya, Turkiye,
        // Münih, losAngles, Bursa, Londra, Londra]

        //Task--> 1 den 10 a kadar sayıları bir list e atayıp print eden code create ediniz
        ArrayList<Integer>listsayı=new ArrayList<>();

        for (int i = 1; i <=10; i++) {
            listsayı.add(i);
        }System.out.println("listsayı = " + listsayı);//[1,2,3,4,5,6,7,8,9,10]


    }
}
