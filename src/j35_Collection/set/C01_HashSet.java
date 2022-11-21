package j35_Collection.set;

import java.util.Arrays;
import java.util.HashSet;

public class C01_HashSet {
    /*
     Set :  1) unique(benzersiz tek) elemanlardan olusur, Set'lerin icinde bir eleman sadece bir kere kullanilabilir. mükerrer(duplicate) eleman olmaz.
            2) sadece bir null değeri alabilir.(treeSet hariç).Java elementleri unique yapmak icin HASH ALGORITMASI kullanir.
                 Java her data icin hashing teknigini kullanarak bir code uretir.Bu code'u almak icin HashCode() methodu kullanilir.
                 Hashing, farklı büyüklükteki girdilerden sabit büyüklükte bir çıktı oluşturma sürecine verilen isimdir.
                  Universitelerdeki ogrenci numaralari gibi bir ogrenci ismi soruldugunda numarasini bulursaniz onunla ilgili tum datalara ulasilabilir.


            Set     --> HashSet         : 1) HashSet, duplication’a(tekrarlı eleman) izin vermez.
                                            Eger bir elemani tekrar HashSet’e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
                                          2) Haset'ler Set'ler arasinda en hizli olanıdir. bir algoritmaya göre kayit eder.
                                           değerlerin giriş sırasına dikkat edilmez. (LinkedHashSet hariç)
                                          3) HashSet "null" object'ini eleman olarak kullanabilir.
                                          Ancak birden fazla null degerini bir HashSet’e eklemek isterseniz sadece bir tane null degeri olur.

                        LinkedHashset   : 1) Tekrarli eleman kabul etmezler. Elemanlari ekleme sirasina(insertion order) gore dizerler.
                                          2) LinkedHashSet, HashSet'den daha yavas calisir.
                                          3)LinkedHashSet "null" object'ini eleman olarak kullanabilir.
                                          4) Ekleme ve remove islemlerinde hizlidirlar.

                        TreeSet         : 1) TreeSet tekrarli eleman kabul etmez, cunku Set'dir.
		                                  2) Elemanlari natural Order'a(String ise alfabetik, sayi ise kucukten buyuge) gore dizer.
		 	                              3) TreeSet, setlerin en yavasidir. Bu yuzden TreeSet kullanirken dikkatli olunmalı...
		 	                              4)AHAN DA TRİCK :TreeSet "null" object'ini eleman olarak kullanilamaz.


         Set Methods :
            .add(eleman);-->Set’e eleman ekler
            .addAll(collection);-->istenen collection’in tum elemanlarini ekler
            .contains(eleman);-->istenen eleman set’te varsa true, yoksa false return eder.
            .containsAll(collection);-->istenen collection’in tumu aranan sette var ise true, yoksa false return eder.
            .remove(eleman);-->istenen eleman bulursa siler ve true dondurur, bulamazsa false return eder.
            .removeAll(collection);-->istenen collection’in tum elemanlarini bulursa siler ve true dondurur, bulamazsa false return eder.
            .equlas(set2);-->istenen set2’le tum elemanlar ayni ise true, yoksa false return eder.
            .retainAll(collection1);-->collection1’nin elemanlarinin disindaki tum elemanlari siler, silme islemi yapti ise true, yoksa false return eder.
              (kesişen ortak elemanları döndürür.)
            .clear();-->sett'teki Tum elemanlari siler
            .isEmpty();-->Sette hic eleman yoksa true, varsa false return eder
            .size();-->set’in eleman sayisini verir

     */
    public static void main(String[] args) {
        HashSet<String>hs= new HashSet<>();//boş bir HashSEt
        HashSet<String>hs1= new HashSet<>(Arrays.asList("Sumeyra","UMit","Umut","Ihsan"));//eleman ataması yapıldı
        //SEt print etme
        System.out.println("hs1 = " + hs1);
        hs1.add("Nagihan");
        hs1.add("Sumeyra");//tekrarlı eleman ekleme
        System.out.println("hs1 = " + hs1);//

        hs1.add(null);
        hs1.add(null);
        hs1.add(null);
        System.out.println("hs1 = " + hs1);//

        HashSet<String>hs2= new HashSet<>(Arrays.asList("Murat","Ismail","Adem"));
        System.out.println("hs2 = " + hs2);
        hs1.addAll(hs2);
        System.out.println("hs1 = " + hs1);

        System.out.println("hs1.remove(\"Basari\") = " + hs1.remove("Basari"));
        System.out.println("hs1.remove(\"Ihsan\") = " + hs1.remove("Ihsan"));
        System.out.println("hs1 = " + hs1);

        System.out.println("hs1.removeAll(hs2) = " + hs1.removeAll(hs2));

        System.out.println("hs1.size() = " + hs1.size());

        System.out.println("hs1.isEmpty() = " + hs1.isEmpty());
        hs1.clear();
        System.out.println("hs1 = " + hs1);
        System.out.println("hs1.size() = " + hs1.size());
        System.out.println("hs1.isEmpty() = " + hs1.isEmpty());

        System.out.println("hs2.contains(\"Ismail\") = " + hs2.contains("Ismail"));
        System.out.println("hs2.contains(\"Javanaz\") = " + hs2.contains("Javanaz"));

        System.out.println("hs2.hashCode() = " + hs2.hashCode());


    }
}
