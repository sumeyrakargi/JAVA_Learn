package j12_Lopps.L01_ForLoop.Tasks.Tasks;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz");
		String cümle=scan.nextLine();

		int rakam=0;
		for (int i=0;i<cümle.length();i++){
			if (cümle.charAt(i)>='0'&&cümle.charAt(i)<='9'){
				rakam++;}
		}System.out.println("Girilen cümlede : "+rakam+" adet rakam vardır. ");
	}
}
