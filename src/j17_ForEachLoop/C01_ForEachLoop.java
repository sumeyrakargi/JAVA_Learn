package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        /*
        foor-each loop for loop un gelişmiş haldir.
        1.clean code- yazım kolaylığı
        2. code okuma kolaylığı
        3.hata yapma riskini azaltır
         */
        List<Integer>sayılist= new ArrayList<>(List.of(16,5,33,2,22,27,41,24));
        //task--> list elemanlarını ayrı satırllara print ediniz

        for (Integer a:sayılist) {
            System.out.println(a+" ");
        }

        //TAsk 2--> list elemanlarının ilk 3 elemanı hariç tek olanları print ediniz.

        sayılist.subList(3,sayılist.size());

        for (Integer a : sayılist) {
            if (a%2==1) System.out.print(a+" ");
        }
        //Task 0-->lis elemanlarının 2,5 index arasındaki (2,3,4,5) elemanlarının toplamını yazdırın

        int toplam=0;
        for (Integer a : sayılist.subList(2,6)) {
          toplam+=a;
        }System.out.println(toplam);//84
}}
