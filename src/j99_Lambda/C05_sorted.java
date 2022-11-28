package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_sorted {

    public static void main(String[] args) {


        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        System.out.println("\n---****----");

    }//main sonu

    //Task--> list in çift elemanlrının karelerini küçükten büyüğe print edin

    public static void ciftKare(List<Integer> sayi){
        sayi.
                stream().//list elemanları akışa alındı
                filter(C01_LambdaEXpression::ciftMi).// akıştaki elemanlar çift olma şartına göre filtrelendi
                map(t->t*t).//filtrelenen elemanların karesi update edildi
                sorted().//karesi alınan elemanlar sıralandı
                forEach(C01_LambdaEXpression::yazdir);//print
        //sorted().//doğal düzene göre sıralanmış
        //sorted().//method tekrarlı alınırsa son kullanılan aktif olur
    }

    public static void ctekKare(List<Integer> sayi) {
        sayi.stream().filter(t -> t % 2 == 1).map(t -> t * t).sorted(Comparator.reverseOrder()).forEach(C01_LambdaEXpression::yazdir);

        //reverseOrder() => Comparator Class'ının bir methodudur. Doğal sıralamanın tersini (büyükten küçüğe) uygulayan
       // bir Comparator (karşılaştırıcı) return eder.
    }
    }
