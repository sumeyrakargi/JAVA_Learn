package j34_Iterators;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        /*
        verilen bir int list in tek elemanlarının karesini tersten print eden code create ediniz
         */
        Scanner sc= new Scanner(System.in);
        List<Integer>sayilist = new ArrayList<>(List.of());
        int sayi;
        do {
            System.out.println("Lütfen bir sayı giriniz,çıkmak için  0 giriniz");
            sayi= sc.nextInt();
            if (sayi!=0)
        sayilist.add(sayi);
        }while (sayi!=0);
        System.out.println(sayilist);

        ListIterator<Integer>list2 = sayilist.listIterator();
        while (list2.hasNext()){
            sayi=list2.next();
            if (sayi%2==1){
                list2.set(sayi*sayi);
        } else list2.remove();
        }while (list2.hasPrevious()){
            System.out.print(list2.previous() + " ");
        }
}}
