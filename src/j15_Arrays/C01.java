package j15_Arrays;

import java.util.Arrays;

public class C01 {

    public static void main(String[] args) {
        /*
        Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
        Array olusturulurken 2 seyi declare etmeliyiz:
        1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar olmalıdır.)
        2- uzunluk (uzunluk array'in icerisne konulan max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
        array= tepsiye benzer..
        Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
         isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
         */
        // Array tanımlama...
        int a;//declare edilen ama atanmayan primitive data
        int arr[] ;//declare (tanımlanan) edilen ama atanmayan int type array
        //tanımlanan array atama yapılmadan kullanılamaz...

        String  isimArr[] ={"muharrem","enise","cebrail","nazım","özge"};// hem tanımlama hem atama yapılan String array
        //String [] isimArr1 ={"muharren","enise","cebrail","nazım","özge"};// hem tanımlama hem atama yapılan String array
        int sayıArr[]=new int[5];//java heap memorhy'de 5 default->0 olan int array  create edildi
        // [0,0,0,0,0]


        // Array'a eleman ekleme...
        sayıArr[2]=34;
        sayıArr[0]=35;
        sayıArr[1]=34;
        sayıArr[3]=61;
        sayıArr[0]=34;//  0 index array elamanı 34 değeri ile update edildi
        //array elemanlrı uniqe olmak zorunda değildir tekrarlı array elamnı olabilir.

        // Array eleman sayısı boyut değeri...

        System.out.println("sayıArr.length = " + sayıArr.length);//5
        System.out.println(Arrays.toString(sayıArr));

        // Array son elemanı ...
        System.out.println("array son elemanı :" + isimArr[isimArr.length - 1]);//özge
        isimArr[isimArr.length - 1]="QA Özge hanım";//array son eleman update edildi.


        // Array de olmayan eleman

        //okkalı bir TRICK ->  sayıArr[11]=23;//cte vermez ama olmayan eleman rte veririr-> array run time da oluşur


        // Array elamanları print etme...
        for (int i = 0; i < isimArr.length; i++) {
            System.out.print(isimArr[i]+" ");
        }
        System.out.println();
        System.out.println("isimArr = " + isimArr);//isimArr = [Ljava.lang.String;@79698539 -> isimArr referans değeridir
        System.out.println(Arrays.toString(isimArr));//isim Array sitringe çevrildi.



        //Task-->sayıArr elemanlarından değeri tek olanları print eden code creaate ediniz

        for (int i = 0 ; i<=sayıArr.length-1 ; i++) {
            System.out.println((sayıArr[i]%2==1 ? sayıArr[i] : ""));}

        //Task-->sayıArr çift index elemanları print eden code creaate ediniz

        for (int i = 0; i < sayıArr.length; i+=2) {
            System.out.println(sayıArr[i]);}


        //Task--> isimArr 5 harfli elemanlarında oluşan arrayın elemanlarını print eden code create ediniz.

        //String yeniArr[]=new String[isimArr.length];//isimArr elemanı kadar boş yeni arr
        for (int i = 0; i <isimArr.length ; i++) {
            if (isimArr[i].length()==5) System.out.println(isimArr[i]);
        }
        //Array elemanları naturel(k->b:ascending b->k:descending, alfabetik) sıralama için sort(); method kulanılır
        System.out.println(Arrays.toString(isimArr));//sıarlama öncesi-> [muharrem, enise, cebrail, nazım, QA Özge hanım]
        Arrays.sort(isimArr);//isimArr elemanları naturel sıralama yapıldı
        System.out.println(Arrays.toString(isimArr));//sıralama sonrası -> [QA Özge hanım, cebrail, enise, muharrem, nazım]

        System.out.println(Arrays.toString(sayıArr));//sıralama öncesi sayıArr->[34, 43, 34, 99, 0]
        Arrays.sort(sayıArr);// sayıArr k-> b sıralandı
        System.out.println(Arrays.toString(sayıArr));//sıralama sonrası sayıArr-> [0, 34, 34, 43, 99]


    }}

