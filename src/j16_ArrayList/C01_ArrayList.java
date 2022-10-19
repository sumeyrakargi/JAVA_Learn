package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {

    public static void main(String[] args) {

        int sayi=33;//tek data saklanan variableyapı
        int sayi1 []=new int[5];// 5 int veri saklanan yapı
        int sayi2 [][]=new int[5][6];// 30int veri saklanan yapı
        ArrayList<Integer>sayılist=new ArrayList<>();// istenildiği kadar veri saklanabilwn yapı

        /*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
            List<Type> arrayListName = new ArrayList<>();

             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde olmalidir
                - ArrayList<int> hatali bir tanimlamadir. wrapper class dedigimiz object türünden olmalidir
                - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...

            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


    key word: List<wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrayy.toString(arrayAdi); ile yazdirilabilir.


    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

 */

        ArrayList<Integer>listsayı=new ArrayList<>();//boş integer tipi list oluşturuldu.
        //1. yol--> add();method
        System.out.println("listsayı = " + listsayı);//[]
        listsayı.add(10);// list ilk eleman olarak 10 değeri eklendi
        System.out.println("listsayı = " + listsayı);//[10]
        listsayı.add(39);
        listsayı.add(23);
        listsayı.add(36);
        listsayı.add(41);
        listsayı.add(41);//list elemanı tekrarı kabul eder
        System.out.println("listsayı = " + listsayı);//[10,39,23,36,41,41]

        //2.yol-->Arays.asList();method
        ArrayList<String>listisim=new ArrayList<>(Arrays.asList("Yusuf","Umut","Ümit"));//[Yusuf,Umut,Ümit]
        System.out.println("listisim = " + listisim);

        //3.yol-->List.of();method
        ArrayList<String>listülke=new ArrayList<>(List.of("Amerika","Almanya","Turkiye"));
        listsayı.add(2,14);//listde index 2 ye 14 değerini ekledi
        System.out.println("listsayı = " + listsayı);//[10,39,14,23,36,41,41]



    }
}
