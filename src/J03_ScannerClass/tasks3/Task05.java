package J03_ScannerClass.tasks3;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

		Scanner sc=new Scanner(System.in);
		System.out.println("Sayı 1 için bir tamsayı değeri giriniz : ");
		int sayı1= sc.nextInt();
		System.out.println("Sayı 2 için bir tamsayı değeri giriniz : ");
	    int sayı2= sc.nextInt();

		System.out.println("Toplam değeri = " + (sayı1+sayı2));
		System.out.println("Fark = " + (sayı1-sayı2));
		System.out.println("Çarpım değeri = " + (sayı1*sayı2));
		System.out.println("Bölüm = "+ ((double)sayı1/sayı2));




	}

}
