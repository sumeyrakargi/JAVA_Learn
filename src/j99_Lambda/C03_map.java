package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_map {

    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        ciftKare(sayi);
        System.out.println("\n---****----");
        kup(sayi);
        kare(sayi);


    } //main sonu

    //map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.
    // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz

    public static void ciftKare(List<Integer> sayi){

        sayi.stream().filter(C01_LambdaEXpression::ciftMi).map(t->t*t).forEach(C01_LambdaEXpression::yazdir);

    }

    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi
    public static void kup(List<Integer> sayi){

     sayi.stream().filter(t->t%2==1)./*map(t->(t*t*t)+1).?*/map(t->(int)Math.pow(t,3)+1).forEach(C01_LambdaEXpression::yazdir);
    }

// Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
public static void kare(List<Integer> sayi){

    sayi.stream().filter(C01_LambdaEXpression::ciftMi).map(Math::sqrt).forEach(t->System.out.println(t+" "));
}


}
