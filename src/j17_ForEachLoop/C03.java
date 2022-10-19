package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03 {
    public static void main(String[] args) {

        //Task--> iki strng array elemanlarının ortak olmasını kontrol eden code create ediniz


        String arr[]={"Bursa","bartın","Ankara","izmir"};
        String arr2[]={"Afyon","Bartın","Bolu","Eskişehir"};
        List<String> ortakisim=new ArrayList<String>();

        for (String a:arr) {
            for (String b:arr2) {
                if (a.equalsIgnoreCase(b)){
                   ortakisim.add(a);
                System.out.println(a+" ");
                    System.out.println(ortakisim);}
    }}
        if (ortakisim.isEmpty()) {
            System.out.println("ortakisim yok.");
        }else System.out.println(ortakisim);

    }}
