package j09_Switch_Statement.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
		Scanner sc=new Scanner(System.in);
		System.out.println("VIP KISALTMASINDAKİ HARFLERDEN BİRNİ GİRİNİZ");
		char harf=sc.next().toUpperCase().charAt(0);

    switch (harf){
		case 'V':
			System.out.println("Very");
			break;
		case 'I':
			System.out.println("Important");
			break;
		case 'P':
			System.out.println("Person");
			break;
		default:
			System.out.println("Hatalı giriş.");


	}

	}
}
