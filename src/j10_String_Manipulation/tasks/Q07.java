package j10_String_Manipulation.tasks;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen üç harfli bir kelime giriniz.");
        String kelime= sc.next();

        if (kelime.length()==3)
            System.out.println(kelime.charAt(0)==kelime.charAt(1)||kelime.charAt(0)==kelime.charAt(2)||kelime.charAt(1)==kelime.charAt(2)?"AYnı harfleri içeriyor":"Aynı harfeleri içermiyor.");

        else System.out.println("Girdiğiniz kelime üç harfli değildir.");


    }
}