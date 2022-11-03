package j23_Varargs_StringBuilder.Varargs;

public class C01_Varargs {
    /*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        meyhod budy....
        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
         */

    // Task -> verilen iki toplamını print eden METHOD create ediniz
    public static void main(String[] args) {
        //Task-->verilen iki sayı toplamını print eden METHOD create ediniz
        int sayi1=24;
        int sayi2=27;
        int sayi3=46;
        int sayi4=10;
        topla(sayi1, sayi2);
        topla(sayi2, sayi3);
        topla(sayi3, sayi1);
        topla(sayi3, sayi1,sayi4);

        System.out.println("---***---");
        toplaVarargs(sayi1, sayi2,78,56,21, sayi3, sayi4);

    }
    public static void topla(int a,int b){
        System.out.println("sayılar toplamı" +(a+b));

    }
    public static void topla(int a,int b,int c){
        System.out.println("sayılar toplamı" +(a+b+c));

    }
    public static void toplaVarargs(int...a){
        int toplam=0;
        for(int w:a){
            toplam+=w;

        } System.out.println("Sayıların toplamı " +toplam);

    }

}
