package j29_Exeptionn;

import java.util.Scanner;

public class C07_IllegalArgumentException {
    public static void main(String[] args) {
        //IllegalArgumentException--> kullnılmasını istenmeyen değerlerde programın hata vermesi isteniyorsa bu excp. fırlatılır.
        //örnek : yaş datası için negatif değer girildiğinde programın kırılmadan run olması fakat girilen değer
                 // için excp.fırlatması istenirse kullanılır.
        /*
ahan da TRİCK kosesinde bugun :)

"throw" - throws" farkları
1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
   "throw" -> method body içinde tanımlanır.
2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
   "throw" -> keywordden sonra sadece bir tane exception tanımlanır
3- "throws" -> keywordden sonra sadece exception class name yazılır
    "throw" ->  keywordden sonra exception obj tanımlanır
4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
    "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
 */
        // IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
        // ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girile değer için excp fırlatması için kullanılır..

        Scanner sc=new Scanner(System.in);
        System.out.println("yaşınızı giriniz.");
        int yas=sc.nextInt();
        // if (age<18){
        //     System.out.println("yasınız : "+age+" ehliyet için uygun değil ");
        //     throw new IllegalArgumentException();//throw komutu try-catch block olmadan da istenen method body'de tanımlanabilir.
        // }
        // else System.out.println("yasınız : "+age+" ehliyet için uygun");
        try {
            if (yas<=18) {
                throw new IllegalArgumentException();//throw keyword ile Excp. obj oluşturularak hata tanımlanır ve fırlatılır
                //böylece catch block a düşürerek daha pratik code yazılır.
                //  System.out.println("ehliyete basvurman için daha  : " + (18 - age) + "yıl var ...");
                // throw çalıştrılmaz ise try içinde if çalışır ,catch block çalışmaz
            }else {
                System.out.println("try dan selam");
                System.out.println("ehliyet için uygun ");}
        }catch (IllegalArgumentException e){
            System.out.println("Ehliyet için 18 yaş ve üzeri olmalıdır");
            System.out.println("a catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");
        }
        System.out.println("devam");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur


    }
}
