package code_challange.lambdaCodeChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C2_StringList_StreamOrnekleri {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");




    // S1: ilk harfi d ve ya c olanlari listeleyelim *** filter-startsWith()
        list.stream().filter(t ->t.startsWith("d") || t.startsWith("c")).forEach(t -> System.out.print(t+" "));
        System.out.println();

    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim *** map(t-> "*" + t + "*")
      list.stream().map(t -> ("*" + t + "*")).collect(Collectors.toList()).forEach(t -> System.out.print(t + " "));
        System.out.println();


    //S3: alfabetik  olarak siralayalim list olarak ***sorted()
        list.stream().map(String::toLowerCase).sorted().forEach(t -> System.out.print(t+" "));
        System.out.println();

    //S4: tum 'l' leri silelim yazdiralim ***map(replaceAll)
        list.stream().map(t->t.replaceAll("l", "")).forEach(t -> System.out.print(t+" "));
        System.out.println();

    //S5 : icinde e olanlardan yeni bir list olusturunuz  *** filter(contains())  collect()
        list.stream().filter(x->x.contains("e")).collect(Collectors.toList()).forEach(t -> System.out.print(t+ " "));
        System.out.println();

    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
       //     ***map(t-< t.substring(0,1) + t-< t.substring(0,1) + t) forEach()
        list.stream().map(x->x.substring(0,1)+x.substring(0,1)+x).forEach(x-> System.out.print(x+ " "));
        System.out.println();

    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
       //   ***map(t-< t.substring(0,1).toUpperCase() + t.substring(1).toLowerCase() forEach
        list.stream().map(t ->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).forEach(t -> System.out.print(t + " "));
        System.out.println();
    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz
            // ***filter(x-> x.length () !=4 && x.length () !=6)  collect
        list.stream().filter(x->x.length()!=4&&x.length()!=6).collect(Collectors.toList()).forEach(x-> System.out.print(x+" "));





}}
