package j12_Lopps.L02_WhileLoop.WhileLoopTask;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner sc=new Scanner(System.in);
		System.out.println( "Adınızı giriniz :");
		String ad=sc.nextLine().toUpperCase();
		System.out.println( "Soydınızı giriniz :");
		String soyad=sc.nextLine().toUpperCase();
		String adsoyad=ad.concat(soyad);
		int a=0;
		while (a<=adsoyad.length()){

			System.out.print(adsoyad.charAt(a)+" ");
			a++;
		}

		
	}

}
