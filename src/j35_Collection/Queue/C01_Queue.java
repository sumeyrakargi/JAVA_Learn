package j35_Collection.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
        Queue coll. interface olduğu için child class olan LinkedList ve PriorityQueue ile obj üretilir.
        Eczane, yemekhane ve belirli şart ile aksiyon alan elemanlar için kullanılır
        Cons. seçimine göre queue obj özellikleri belirlenir
        FIFO--> first in first out : Coll. ilk giren eleman ilk çıkar.Eleman en sona eklenir,ilk eklenen çıkar.
       */

        Queue<String> q1= new LinkedList<>(Arrays.asList("Cebrail","Sumeyra","Umit","Umut"));
        System.out.println("q1 = " + q1);
        q1.add("Yusuf");
        System.out.println("q1 = " + q1);//q1 = [Cebrail, Sumeyra, Umit, Umut, Yusuf]-->Insertion order
        Queue<String> q2= new PriorityQueue<>(Arrays.asList("JavaCAN","JavaSu","JavaNAZ","JavaNur"));
        System.out.println("q2 = " + q2);//q2 = [JavaCAN, JavaNur, JavaNAZ, JavaSu]
        q2.add("java");
        System.out.println("q2 = " + q2);//q2 = [JavaCAN, JavaNur, JavaNAZ, JavaSu, java]

        System.out.println("q1.element() = " + q1.element());//Cebrail
        System.out.println("q1.peek() = " + q1.peek());//Cebrail


        System.out.println("q1.remove() = " + q1.remove());//Cebrail--->boş olsaydı exc.fırlatırdı
        System.out.println("q1 = " + q1);//q1 = [Sumeyra, Umit, Umut, Yusuf]--->Cebrail removed

        System.out.println("q1.poll() = " + q1.poll());//Sumeyra---> boş olsa da excp vermez
        System.out.println("q1 = " + q1);//q1 = [Umit, Umut, Yusuf]

        //peek ()--> copy paste gibi,ilk elemanı retur eder fakat silmez.
        //element ()-->İlk elemanı silmeden return eder.
        // poll()---> cut paste gibi,ilk elemanı siler ve return eder.
        //remove ()-->ilk elemanı siler ve return eder.
        //Trick--> poll ve remove farkı şudur; eğer queue coll boş ise remove exception fırlatır. poll() ise null return eder.

        q1.clear();//queue coll. elemanları silindi
        System.out.println("q1.size() = " + q1.size());//0
        System.out.println("q1.poll() = " + q1.poll());// null
        //System.out.println("q1.remove() = " + q1.remove());//NoSuchElementException

        //offer ()--> queue coll. eleman eklemek için kullanılır.
        System.out.println("q2.offer(\"MOney\") = " + q2.offer("MOney"));//true-->eklendi
        /*
        offer ve add farkı--> eğer queue coll. eleman kısıtlaması yapılmış ise add methodu Exception fırlatır.
       offer ise true-false return eder.
         */

    }
}
