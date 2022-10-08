package j12_Lopps.L02_WhileLoop.WhileLoopTask;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task 03-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int sayı=sc.nextInt();

		int i=1;
		while (i<=sayı){
			System.out.println(i+"x"+sayı+"="+i*sayı);
			i++;
		}
		System.out.println();
	}

}
