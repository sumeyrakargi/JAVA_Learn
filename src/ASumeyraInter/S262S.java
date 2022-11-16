package ASumeyraInter;

import java.util.Arrays;

public class S262S {
    public static void main(String[] args) {
        //Convert ArrayList to Array
        int[] arr = {1,2,3,4,56,57,5,8};

        getLargest1(arr);

      System.out.println(getLargest(arr, 7));
    }

    private static int getLargest1(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("lergest num :" + max);
        return max;
    }

    private static int getLargest(int[]arr,int total) {

        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j <= total; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[total];


    }}


