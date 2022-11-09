package ASumeyraInter;

import java.util.Arrays;

public class S26 {
    public static void main(String[] args) {

        //Find first two max number in Array

        int[] a = {1,3,65,23,4,7,2,32,65,12,96};
        getTwoMaxValues(a);
    }

    private static void getTwoMaxValues(int[] a) {
        Arrays.sort(a);
        System.out.println("Max sayı :"+(a[a.length-1])+"\nİkinci Max sayı :"+(a[a.length-2]));
    }
}
