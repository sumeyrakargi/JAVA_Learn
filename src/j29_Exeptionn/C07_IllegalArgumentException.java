package j29_Exeptionn;

import java.util.Scanner;

public class C07_IllegalArgumentException {
    public static void main(String[] args) {
        //IllegalArgumentException--> kullnılmasını istenmeyen değerlerde programın hata vermesi isteniyorsa bu excp. fırlatılır.
        //örnek : yaş datası için negatif değer girildiğinde programın kırılmadan run olması fakat girilen değer
                 // için excp.fırlatması istenirse kullanılır.


        Scanner sc=new Scanner(System.in);
        System.out.println("yaşınızı giriniz.");
        int yas=sc.nextInt();
        try {
            if (yas<=18) {
                throw new IllegalArgumentException();//throw keyword ile Excp. obj oluşturularak hata tanımlanır ve fırlatılır
                //böylece catch block a düşürerek daha pratik code yazılır.
                // throw çalıştrılmaz ise try içinde if çalışır ,catch block çalışmaz
            }else {
                System.out.println("try dan selam");
                System.out.println("ehliyet için uygun ");}
        }catch (IllegalArgumentException e){
            System.out.println("Ehliyet için 18 yaş ve üzeri olmalıdır");
        }
        System.out.println("devam");


    }
}
