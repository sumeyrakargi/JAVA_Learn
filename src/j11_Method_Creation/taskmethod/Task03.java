package j11_Method_Creation.taskmethod;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.

		Scanner scanner = new Scanner(System.in);
		System.out.print("lütfen saat giriniz: ");
		int saat = scanner.nextInt();
		System.out.print("Lütfen mili giriniz: ");
		int mil = scanner.nextInt();
		System.out.print("Lütfen kilogram giriniz: ");
		int kg = scanner.nextInt();
		dönüştür(saat,mil,kg);

	}
	public static void dönüştür(int saat,int mil,int kg){
		int saniye = saat * 3600;
		double km = mil * 1.609344;
		int gram = kg * 1000;
		System.out.println(saat+ "saat ="+ saniye+ " saniyedir"+"\n"+mil + "mil ="+km+" km dir." +"\n"+ kg +" kg = "+gram+ "gram dir.");
	}
	
	
}
