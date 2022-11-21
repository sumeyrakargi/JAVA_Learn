package j35_Collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Task2 {
    // HashSet ve treeSet tanımlayıp run sürelerini karşılaştırınız
    // Trick-->suresi için System.currrentTimeMillis() meth. call ediniz..

    public static void main(String[] args) {


    long tsBasla = System.currentTimeMillis();//treeset run baslama zamanı alındı

    TreeSet<String >ts=new TreeSet<>();
        ts.add("Salim");
        ts.add("Koray");
        ts.add("Haluk");
        ts.add("Harun");
        ts.add("Hasan");
        ts.add("Hasmayan");
        ts.add("Koray");

    long tsBitir= System.currentTimeMillis();// treeSet bitis zamanı alındı

        System.out.println("ts run suresi :"+(tsBitir-tsBasla));// treeSet rub suresi hesaplandı

        System.out.println("   ***  ");

    long hsBasla = System.currentTimeMillis();
    HashSet<String >hs=new HashSet<>();
        hs.add("Salim");
        hs.add("Koray");
        hs.add("Haluk");
        hs.add("Harun");
        hs.add("Hasan");
        hs.add("Hasmayan");
        hs.add("Koray");


    long hsBitir= System.currentTimeMillis();
        System.out.println("hs run suresi :"+(hsBitir-hsBasla));
    // iyi bir javaCAN için gelişMAC lazım :)

}}
