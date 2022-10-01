package j08_If_Statement;

import java.util.Scanner;

public class C02_ifelse_Statement {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz:");
        int yaş= sc.nextInt();
        if(yaş>18)
            System.out.println("Yaşınız 18 den büyüktür");


        /* TASK-> girilen yaşın 18 den büyüklüğünü kontrol edip code create ediniz
    18 den küçük ise ehliyet alamaz print edin


     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz:");
        int yas= sc.nextInt();
        if(yas>18)
            System.out.println("yaşınız 18 den küçük değil.");

        else
         System.out.println("Ehliyet alamazsınız.");




    }


    public static class Ex06 {

        public static void main(String[] args) {
            /*
            TASK--> Kullanıcının cinsiyeti kadın ise 60 yaşından büyük ve prim günü 6000den fazla ise emekliliğini
           Kullanıcının cinsiyeti erkek ise 65 yaşından büyük ve prim günü 7000den fazla ise
           emekliliğini kontrol edip kalan yıl ve prim gününü print eden code create ediniz.
             */





        }
    }
}
