package j12_Lopps.L02_WhileLoop.WhileLoopTask;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println( "Bir metin giriniz.:");
		String metin=sc.nextLine().toUpperCase();
		int hs=0;
		int rs=0;
		int ks=0;
		int i=0;
		do{
			if (metin.charAt(i)>='A'&&metin.charAt(i)<='Z'){
				hs++;
			} else if (metin.charAt(i)>='0'&&metin.charAt(i)<='9') {
				rs++;
			}else {ks++;}
			i++;
		}while (i<metin.length());
		System.out.println("Girilen metinde bulunan harf sayısı :"+hs+"\nGirilen metinde bulunan rakam sayısı :"+rs+
				"\nGirilen metinde bulunan özel karakter sayısı :"+ks);
	}}
