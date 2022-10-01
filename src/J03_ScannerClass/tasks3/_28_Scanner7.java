package J03_ScannerClass.tasks3;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir banka hesabınız var mı (true\\false)?: " );
        boolean a= sc.hasNextBoolean();
        System.out.println(a);













    }
}
