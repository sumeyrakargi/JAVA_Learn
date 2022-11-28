package j35_Collection.LinkedList;

import java.util.*;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        LinkedList
        1-LinkedList de elemanlar "data" ve "adres" olmak üzere iki kısımdan oluşur ve eleman yerine "node" olarak tanımlanır.
        2-LinkedList de ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
        3-LinkedList de son node adres kısmı null olan sadece data bulunduran tail node tanımlanmıştır.
        4- ArrayList searching LinkedList node ekleme ve silmede daha avantajlıdır. LinkedList eleman bulmada index yağpısı olmadığı
           için başarısızdır.
        5-LinkedList --> tren vagon ilişkisi bağlantısı gibi düşünülebilir.
        6- Collection obje tanımlanırken constructer Class(LinkedList,ArrayList...) olmalı ,interface(List,Queue ..)olmamasına dikkat edilmeli
        Ancak obj DataType olarak parent interface tanımlanabilir.
        7-LinkedList class iki tane parent interface 'den(List ,Queue) implement etmiştir.
         */

        LinkedList<String>ll1=new LinkedList<>(Arrays.asList("Sumeyra","umut","Murat","Adem","Busra","Ismail"));

        //LinkedList print..
        System.out.println("ll1 = " + ll1);
        //LinkedList print..
        ll1.add("Yusuf");
        System.out.println("ll1 = " + ll1);
        ll1.add(2,"Bera");
        System.out.println("ll1 = " + ll1);
        ll1.addFirst("Qa tster");
        System.out.println("ll1 = " + ll1);
        ll1.addLast("javatar");
        System.out.println("ll1 = " + ll1);
        List<String> ll2 = new ArrayList<>(Arrays.asList("Aliye","Akif","Hatice"));
        ll1.addAll(ll2);
        System.out.println("ll1 = " + ll1);
        //ll1.addAll("agam");//CTE --> parametre Col olmazsa
        System.out.println("ll1 = " + ll1);
        ll1.addAll(3, ll2);
        System.out.println("ll1 = " + ll1);
        System.out.println(ll1.get(5));
        Collections.sort(ll1);
        System.out.println(ll1);

    }
}
