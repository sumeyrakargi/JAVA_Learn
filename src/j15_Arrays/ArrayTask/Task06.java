package j15_Arrays.ArrayTask;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[]= {3,5,6,1,9,45,25,4,9,0};

        sırala(arr);

    }private static void sırala(int[] a) {
        Arrays.sort(a);
        for (int i = a.length-1; i >=0; i--) {
            System.out.print(a[i]+" ");
        }
    }}

