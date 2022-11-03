package j23_Varargs_StringBuilder.StringBuilder;

import java.util.concurrent.Callable;

public class C02_StringBuilder {

    public static void main(String[] args) {

        // StringBuilder obj create etme...
        // 1. yol
        StringBuilder sb1=new StringBuilder();// default capacity 16 bit olan value'su olmayan  bos sb

        System.out.println("sb1.length() = " + sb1.length());//0 -> length(): sb 'deki karakter sayısı return eder

        System.out.println("sb1.capacity() = " + sb1.capacity());//16

        sb1.append("jAVATAR");//javatar sb1' eklendi
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//16

        sb1.append(" selam ").append("olsun").append(" ").append(24).append(" ").append(true);
        System.out.println("sb1 = " + sb1);// jAVATAR selam olsun24true
        System.out.println("sb1.capacity() = " + sb1.capacity());//34

        sb1.append(" basarı gayrete asıktır :)");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//70
        //2. yol
        StringBuilder sb2 = new StringBuilder("Sumeyra hanıma selmalar");//ilk değer ataması yapılmış sb2 STbuild obje
        System.out.println(sb2.capacity());//39-->23+16--->23 karakter ilk değer ataması,16 defoult hafıza yeri atandı.

        //trim methodu--> fazladan ayrılan capacity silinir.

        System.out.println("sb2.length() = " + sb2.length());//23
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());//23

        //3.yol
        StringBuilder sb3 = new StringBuilder(11);//7hafızada 11 karakterlik yer ayıran boş StringBuilder tanımlandı.

        System.out.println("sb3.length() = " + sb3.length());//0
        System.out.println("sb3.capacity() = " + sb3.capacity());//11
        sb3.append("Umut Bera bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());//24

        // istenen bir character index i alma.
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));//m

        //Belirli aralıktaki characterleri alma
        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));//ATAR selam
        System.out.println("sb1.substring(17) = " + sb1.substring(17));//un 24 true basarı gayrete asıktır :)-->17 ve sonakadar tüm karakterler
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));//ATAR selam

        //Belirli bir indexteki karakteri silmek
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));//jAVTAR selam olsun 24 true basarı gayrete asıktır :)
        // 3.index A karakteri silindi.

        System.out.println("sb1.delete(3,12) = " + sb1.delete(3, 12));// -->jAV olsun 24 true basarı gayrete asıktır :)

        //istenen karakterleri eklemek
        System.out.println("sb3 = " + sb3);//Umut Bera bey
        System.out.println("sb3.insert(4,\":)\") = " + sb3.insert(4, ":)"));//Umut:) Bera bey
        String s="güzel insan";
        System.out.println("sb3.insert(12,s) = " + sb3.insert(12, s));//Umut:) Bera güzel insanbey
        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));//Uel imut:) Bera güzel insanbey--> sb3 1.indexine s value2'inin
        //3,7 indexi eklendi.

        StringBuilder sb4=new StringBuilder("Nihan Hanım");
        System.out.println("sb4.insert(5,\"Qa team lead\",0,2) = " + sb4.insert(5, "Qa team lead", 0, 2));//NihanQa Hanım

        //istenen index deki karakteri değiştirme

        sb4.setCharAt(4,' ');
        System.out.println("sb4 = " + sb4);//Niha Qa Hanım
        sb4.setCharAt(6,'A');
        System.out.println("sb4 = " + sb4);//Niha QA Hanım

        // istenen index karakter yerine birden çok karakter eklemek.
        System.out.println("sb4.replace(8,10,\"***\") = " + sb4.replace(8, 10, "***"));//Niha QA ***nım

        //Sb obj Stringe çevirme-->toString
        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());//UEL İMUT:) BERA GÜZEL İNSANBEY

        //String ile StringBuilder karsilastirmasi


         /*
         Compare iki sb'i esit mi diye kontrol etmek icin
         ilk harften baslayarak tum karakterleri karsilastirir
         Ayni olan karakterler icin bir sey return etmezken
         farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
         oldugunu print eder
         Tamamen ayni ise bize 0 return eder

         bir sb ile bir String'i compare etmek istersek Java CTE verir
          */
        StringBuilder sb5= new StringBuilder("javaCAN");
        StringBuilder sb6= new StringBuilder("javaCAN");
        String str ="javaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));//0
        System.out.println(sb5.compareTo(new StringBuilder("str")));//0
        //sb6.compareTo(str)--> CTE verir
        System.out.println(sb6.equals(sb5));//false--> değer olarak aynı fakat referans değerleri ayrı.
        System.out.println(str.equals(sb6.toString()));//true--> sb6 String e çevrildi


    }
}
