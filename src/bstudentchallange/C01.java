package bstudentchallange;

import java.util.ArrayList;
import java.util.Arrays;

public class C01 {
    public static void main(String[] args) {

        int sayi[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};

        System.out.println("sayımız: " + Arrays.toString(sayi));

        System.out.println();//dummy

        ArrayList<Integer> yeniList = new ArrayList<>();

        System.out.println("tek ve çift sayılar ayrıldıktan sonra: \n"+tekCiftAyirma(sayi, yeniList));

    }

    private static ArrayList<Integer> tekCiftAyirma(int[] sayi, ArrayList<Integer> yeniList) {

        for (int a : sayi) {

            if (a % 2 == 1) {
                yeniList.add(a);
            }
        }
        System.out.println("tek sayılar: "+yeniList);

        for (int b:sayi){

            if (b%2==0){
                yeniList.add(b);
            }
        }

        return yeniList;
}}
