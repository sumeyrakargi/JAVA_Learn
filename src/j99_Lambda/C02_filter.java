package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_filter {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));


        System.out.println("\n---****----");
        printCıftStructured(sayi);
        System.out.println("\n---****----");
        printElFunctional(sayi);
        System.out.println("\n---****----");
        printElFunctional2(sayi);
        System.out.println("\n---****----");
        printElFunctional3(sayi);
        System.out.println("\n---****----");



    }//main sonu
    //Task : "Structured Programming":Amele code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında
    // bosluk olacak sekilde print ediniz.

    public static void printCıftStructured(List<Integer>sayi){
        for (Integer w : sayi) {
            if(w%2==0){
            System.out.print(w + " ");}
        }}

    public static void printElFunctional(List<Integer> sayi){

        sayi.
                stream().//list elemanlarını akışa aldı
                filter(t->t%2==0).// akıştaki list elemanlarını çift olma şartına göre filtreledi,akıştan çıkarıldı
                forEach(C01_LambdaEXpression::yazdir);//C01_LambdaEXpression classdaki method refere edildi.
    }


    public static void printElFunctional2(List<Integer> sayi){

        sayi.
                stream().//list elemanlarını akışa aldı
                filter(C01_LambdaEXpression::ciftMi).// akıştaki list elemanlarını çift olma şartına göre filtreledi,akıştan çıkarıldı
                forEach(C01_LambdaEXpression::yazdir);//C01_LambdaEXpression classdaki method refere edildi.
    }

    //Task : "Structured Programming":Amele code kullanarak list elemanlarının 35 ten küçük çift olanları yazdırın

    public static void printElFunctional3(List<Integer> sayi){

        //sayi.stream().filter(t->t>35). filter(C01_LambdaEXpression::ciftMi).forEach(C01_LambdaEXpression::yazdir);
        sayi.stream().filter(t->t>35&&t%2==0).forEach(C01_LambdaEXpression::yazdir);
    }

    //Task : "Structured Programming":Amele code kullanarak list elemanlarının 34 ten büyük yada çift olanları yazdırın

    public static void printElFunctional4(List<Integer> sayi){

        sayi.stream().filter(t->t>34||t%2==0).forEach(C01_LambdaEXpression::yazdir);
    }

}
