package j35_Collection.task;

import java.util.HashSet;
import java.util.List;

public class Task_3 {
    /*
    Task
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı

    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */
    public static void main(String[] args) {
        HashSet<Integer>h1= new HashSet<>(List.of(5,8,7,3,12,56,89));

        totalCount(h1);

    }
    private static HashSet totalCount( HashSet<Integer> h) {

        System.out.println("h.size() = " + h.size());

        return h;
    }
}
