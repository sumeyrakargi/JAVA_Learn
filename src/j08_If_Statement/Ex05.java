package j08_If_Statement;

import java.util.Scanner;

public class Ex05 {


    public static void main(String[] args) {

        /*
        TASK--> girilen iki sayıyı seçilen dört işlemden birine uygulayıp sonucu print eden code create ediniz
         */

        /*
        çözüm1
        Scanner scan = new Scanner (System.in);
		System.out.println("1. sayıyı giriniz : ");
		double x1 = scan.nextDouble();
		System.out.println("2. sayıyı giriniz : ");
		double x2 = scan.nextDouble();
		System.out.println("yapılacak işlemi seçiniz : (+ , - , / , *)");
		char islem = scan.next().charAt(0);
		if (islem == '+') {
			System.out.println(x1 + x2 );
		}else if (islem == '-') {
			System.out.println(x1 - x2);
		}else if (islem == '*') {
			System.out.println(x1*x2);
		}else if (islem == '/'){
			System.out.println(x1/x2);
		}else {
			System.out.println("yanlış işlem seçtiniz ...");
		}
	}
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        double sayi1 = sc.nextDouble();

        System.out.print("2. sayıyı giriniz : ");
        double sayi2 = sc.nextDouble();

        System.out.println("+ için -> 1 seciniz \n- için -> 2 seçiniz \n* için -> 3 seciniz\n/ için -> 4 seciniz");
        int secim = sc.nextInt();

        if (secim == 1) {
            System.out.println("toplama sonucu : " + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("cıkarma sonucu : " + sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("carpma sonucu : " + sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
        } else if (secim == 4) {
            System.out.println("bolme sonucu : " + sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));

        } else System.out.println("agam ne istiyon adam akıllı bişey gir işlemini yapalım");


    }
}




















