package j15_Arrays;

import java.util.Arrays;

public class C06_MdArrays_print {
    public static void main(String[] args) {

        /*
      Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi index

 değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer--> kat array
       *  icerdeki  array'lere  inner--> daire array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */

        //MdArray tanımlama..
        int num[][]=new int[3][5];//3 katlı,her katta 5 daires olan boş bir apartman.--> 3 satır 5 sutun

        //bir sitede 10 dairelik 8 katlı 6 apartman var. nasıl array olarak tanımlanır
        // Array i uzunlukları ile tanımlamak için inner uzunluğu aynı olmalı
         int site[][][]=new int[6][8][10];

         // 24 kişilik 3 sınıf ve 21 kişilik 5 sınıf olan okul nasıl array olarak tanımlanır

        int sınıf24[][]=new int[3][24];// 24 kişilik 3 boş sınıf
        int sınıf21[][]=new int[5][21];// 21 kişilik 5 boş sınıf

        //MdArray ekleme..

        num[2][4]=35;//2.kat 4.daire numarası 35
        num[0][3]=34;//0.kat 3.daire numarası 35
        System.out.println(num[0][3]);//34

        // elemanları girerek Array tanımlama arr[

        int arr[][]={{1,2,3},//0.kat
                {10,20},//1.kat
                {101}};//2.kat
        //3 katlı ap.

        // 101 eleman index-->arr[2][0]

        //MdArray elemanları print etme
        System.out.println(arr[1]);// 1.katın referans değerlerini verir-->[I@19dfb72a
        System.out.println(Arrays.toString(arr[1]));//Birinci katı verir-->[10, 20]
        System.out.println(arr[1][0]);//Birinci katın 0. indeksini verir-->10
        System.out.println(Arrays.toString(arr));//[[I@17c68925, [I@19dfb72a, [I@7e0ea639]--> arrayın referansını veriri.
        System.out.println(Arrays.deepToString(arr));//[[1, 2, 3], [10, 20], [101]]--> Arrayın elemanlarını verir

        // Multidimensional array'leri yazdirmak icin toString methodu kullanilamz
//  toString methodu outer methodu Stringe cevirir
// outer arrayin icinde inner arrayler oldugundan toString methodunda inner array'lerin
// referans degerlerini yazdirilir

//MultiDimensional Array'lerde istenen bir eleman nasil yazdirilir.
    }
}
