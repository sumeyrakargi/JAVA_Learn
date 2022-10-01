package J03_ScannerClass.tasks3;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */


        Scanner sc=new Scanner(System.in);
        System.out.println("Günde kaç saat uyuyorsunuz ?: ");
        int saat=sc.nextInt();

        System.out.println("Ayın " + saat*30/24+ " gününü uykuda geçiriyorsunuz" );
        System.out.println("Yılın " + saat*365/24+" gününü uykuda geçiriyorsunuz" );
        System.out.println("40 yılın " + saat*365*40/24+" gününü uykuda geçiriyorsunuz" );

    }
}
