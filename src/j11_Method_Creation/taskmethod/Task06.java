package j11_Method_Creation.taskmethod;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */


		Scanner sc=new Scanner(System.in);
		System.out.print("Paralelkenar,dikdörtgen ve üçgenden birini seçiniz : ");
		String şekil=sc.next().toLowerCase();

		hesaplama(şekil);
	}
	public static void hesaplama(String şekil){

		if (şekil.equals("paral=elkenar")) {
			Scanner scan= new Scanner(System.in);
			System.out.println("Paralelkenarın yüksekliğini giriniz");
			int h= scan.nextInt();
			System.out.println("Paralelkenarın taban uzunluğunu giriniz");
			int x= scan.nextInt();

			System.out.println("Paralelkenar alanı:" + (h * x) + "\nParalelkenar çevre hesaplaması için diğer kenar bilgisine ihtiyaç vardır");


		} else if (şekil.equals("dikdörtgen")) {
			Scanner scan= new Scanner(System.in);
			System.out.println("Dikdörtgenin bir kenar uzunluğunu giriniz");
			int x= scan.nextInt();
			System.out.println("Dikdörtgenin diğer kenar uzunluğunu giriniz");
			int y= scan.nextInt();
			System.out.println("Dikdörtegen alanı:" + (x*y) + "\nDikdörtgenin çevresi :" + (x+ y) * 2);

		} else if (şekil.equals("üçgen")) {
			Scanner scan= new Scanner(System.in);
			System.out.println("Üçgenin yüksekliğini giriniz");
			int h= scan.nextInt();
			System.out.println("Üçgenin taban uzunluğunu giriniz");
			int x= scan.nextInt();
			System.out.println("Üçgen alanı:" + (h * x) / 2 + "\nÜçgen çevresi(Dik üçgen ise) :" +((Math.sqrt(h*h + x*x))+x+h) );

		}else System.out.println("Yanlış veri girdiniz");
	}



	}


