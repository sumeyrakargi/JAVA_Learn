package j04_AritmeticOperators.AritmeticOperatorTasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		

		Scanner sc= new Scanner(System.in);
		System.out.println("Üç basamaklı bir sayı giriniz :");
		int a= sc.nextInt();
		System.out.println(((a/100)+(a%10)));
		
	}

}
