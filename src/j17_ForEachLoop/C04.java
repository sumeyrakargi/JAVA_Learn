package j17_ForEachLoop;

import java.util.Arrays;

public class C04 {
    public static void main(String[] args) {

          /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        int arr[]={1,-6,9,-18,65,-41,-16};

        sayınınTersi(arr);
    }private static void sayınınTersi(int[] arr) {
        for (int a:arr){
            a*=-1;
            System.out.print(a+" ");
        }
    }}

