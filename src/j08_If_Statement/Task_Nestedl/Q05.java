import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz : ");
        int yas= sc.nextInt();
        System.out.println("Kilonuzu giriniz : ");
        int kilo= sc.nextInt();
        if (yas>=18&&kilo>=50)
            System.out.println("Kan bağışı yapabilirsiniz");
        else System.out.println("Kan bağışı yapamazsınız");

    }

}
