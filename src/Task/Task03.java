package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

		Scanner sc = new Scanner(System.in);
		System.out.print("kaç sayı olsun?= ");
		int arr[] = new int[sc.nextInt()];
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ". sayıyı giriniz :");
			arr[i] = sc.nextInt();
		}
		arr2[arr2.length - 1] = arr[0];
		for (int i = 0; i < arr2.length-1 ; i++) {
			arr2[i] = arr[i+1];
		}
		System.out.println("arr [] = " + Arrays.toString(arr));
		System.out.println("arr2 [] = " + Arrays.toString(arr2));


	}

}
