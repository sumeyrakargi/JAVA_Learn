package j16_ArrayList;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {

        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> list1 = new ArrayList<>( Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        ArrayList<String> aolmayan = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).toLowerCase().contains("a")) {
                aolmayan.add(list1.get(i));
            }
        }
        System.out.println("Aolmayan = " + aolmayan);
    }}

