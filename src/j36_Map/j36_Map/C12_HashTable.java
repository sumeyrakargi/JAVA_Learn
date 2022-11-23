package j36_Map.j36_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
        /*
        HashTable-->HashMap de kullanılan tüm methodlar  hashTable obj ile de call edilir.
        1- HashMap ve TreeMAp thread-safe ve synchronized olmadığı için Map ler arasında thread-safe ve synchronized
        olan bie map e ihtiyaç olduğundan Hashtable tanımlanmıştır.
        2-HashTable hasMAp e göre daha yavaştır.
        3-HashTable key ve value larda null değere izin vermez.
        4-HashTable eleman ataması yapılırken hasMAp gibi randum (rastgele:hurra) yapar
         */

        Hashtable<String,String>ht= new Hashtable<>();
        ht.put("kebap","Adana");
        ht.put("döner","Sivas");
        ht.put("köfte","Akçabat");
        ht.put("Alinazik","Gaziantep");
        ht.put("söğüş","");
        System.out.println(ht);//{köfte=Akçabat, söğüş=, döner=Sivas, Alinazik=Gaziantep, kebap=Adana}
        ht.put("döner","dönerse senindir :)");// döner key update edilir.key de duplicate değil üzerine value ataması yapılı.

        System.out.println(ht);//{köfte=Akçabat, söğüş=, döner=dönerse senindir :), Alinazik=Gaziantep, kebap=Adana}

       // ht.put(null,"trileçe");-->NullPointerException fırlatır. null değer alamaz.
       // ht.put("trileçe",null);-->NullPointerException fırlatır. null değer alamaz.

        Hashtable<String,String>ht2= new Hashtable<>();
        ht2.put("salata","patlıcan közleme");
        ht2.put("ara sıcak","içli köfte");

        ht.putAll(ht2);
        System.out.println("ht = " + ht);//{köfte=Akçabat, salata=patlıcan közleme, söğüş=, döner=dönerse senindir :), ara sıcak=içli köfte, Alinazik=Gaziantep, kebap=Adana}
        System.out.println("ht2 = " + ht2);// {salata=patlıcan közleme, ara sıcak=içli köfte}

    }
}
