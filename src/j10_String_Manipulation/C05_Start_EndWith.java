package j10_String_Manipulation;

import java.util.Scanner;

public class C05_Start_EndWith {

    public static void main(String[] args) {

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String sehir="İstanbul";
        System.out.println(sehir.startsWith("İ"));//true
        System.out.println(sehir.startsWith("İs"));//true
        System.out.println(sehir.startsWith("s"));//false
        System.out.println(sehir.endsWith("l"));//true
        System.out.println(sehir.startsWith("t", 2));//true  2.index t ile

        String Sümeyra="Sümeyra çok mutsuz";
        System.out.println( Sümeyra.startsWith("çok", 8));//true-> saymaya 0 ile başlar

        String Sumeyra=" Sümeyra çok mutsuz";
        System.out.println( Sumeyra.startsWith("çok", 8));//false-->saymaya 0 ile başlar,boşluk da bir karakterdir

        //Task--> girilen email hesabının @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        //gmail.com ile ile bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("Email adresinizi giriniz.");
        String email= sc.next();
        if (!email.contains("@gmail.com"))System.out.println("Lütfen gmail hesabı giriniz.");
        else if (email.endsWith("gmail.com")) System.out.println("Hesabınız onaylandı");
        else System.out.println("Lütfen geçerli adres giriniz.");

    }
}
