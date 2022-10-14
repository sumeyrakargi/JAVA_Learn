package Task;

import java.util.Arrays;
import java.util.Scanner;

public class T04_AnagramKontrol {

	public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz
			isAnagram("listen", "Silent") ==> true
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("bir string  giriniz : ");
		String str1 = sc.nextLine();

		System.out.print("bir string  giriniz : ");
		String str2 = sc.nextLine();

		String str1Arr[] = str1.split("");
		Arrays.sort(str1Arr);

		String str2Arr[] = str1.split("");
		Arrays.sort(str2Arr);

		System.out.println(Arrays.equals(str1Arr, str2Arr));
	}}
