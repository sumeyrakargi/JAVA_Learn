package j25_Encapsulation.j25_Encapsulation01;

public class C01_Encapsulation {
    /*
   1) Encapsulation kisaca "data hiding" demektir

   2) Basarili bir Encapsulation için :
      a)Nasil kullanilacagi ve hedefi net iolmalidir.(Direksiyon gibi)
      b)Kodun karmasikligi kullanimin karmasikligina sebep olmamalidir.Yani cok
       karmasik kodlardan olusan bir yapi basit bir sekilde kullanilabilmelidir.
      c)Bir bolumun hata vermesi diger bolumlerin hatasına sebep olmamalidir.

   3) Encapsulation yapısı  tanımlanması için
      a)Access modifier'lari private tanımlanmalı
      b) istenilen field'lar için  getter ve setter methodlari ile "encapsulated" datalar okunmalı (getter) ve
       update edilebilmeli(setter)    .
       c) uygun constructor tanımlanmalı.
       d) toString() method tanımlanmalı


   4) Encapsulation'in faydalari
      a) Esneklik(Flexibility). Field'lar setter() methodunu ile istenildiği kadar update edilebilir
      b) Reusability-> Field'lar  getter ve setter method'lari bir kere tanımlanıp proje icindeki
        tum classlar'dan istenildiği kadar kullanabiliri.
      c) Istenilen field  okunabilir(getter() olustur), istenilen field okunamaz(getter() olusturma)
       hale getirebilir.
      d) Istenilen field degistirebilir (setter() olustur), Istenilen field degistirilemez
       (setter() olusturma) yapabilir.
       Not : Tum variable'lar private ve sadece getter() method tanımlanan  class'da
        data'lar sadece okunabilir, degistirilemez. Bu tarz class'lara "immutable class" denir.

   5) Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya gosterilmez.

 */
    public static void main(String[] args) {

        C02_Encapsulation obj2= new C02_Encapsulation();
        System.out.println("obj2.getName() = " + obj2.getName());
        C02_Encapsulation obj1= new C02_Encapsulation("Sümeyra",30);
        System.out.println("obj1.getName() = " + obj1.getName());//obj1.getName() = Sümeyra
        System.out.println("obj1.getId() = " + obj1.getId());//obj1.getId() = 30
        System.out.println("obj2.getName() = " + obj2.getName());//obj2.getName() = Gamze Hanım
        System.out.println("obj2.getId() = " + obj1.getId());//obj1.getId() = 1001

        obj1.setName("Sümeyra QA tester");
        System.out.println("obj1.getName() = " + obj1.getName());//obj1.getName() = Sümeyra QA tester
    }
}


