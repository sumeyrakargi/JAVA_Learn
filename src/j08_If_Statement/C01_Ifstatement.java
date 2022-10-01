package j08_If_Statement;

public class C01_Ifstatement {
    public static void main(String[] args) {

        int krmYas=33;
        int ismlYas=40;

        if (krmYas==ismlYas){
        System.out.println("aynı yaştasınız güzel insanlar");
        System.out.println("yoksa siz ikiz misiniz");}//--> süslü parantez olmaz ise bu satır if kapsamına girmezdi

        if (krmYas>=40)
        System.out.println("krm bey olgunluk yaşındasınız");
        //if blokta { kullanılmaz ise ; e kadra  olan komut çalışır.

        if (krmYas+ismlYas>100)
        System.out.println("kerem bey ve ismail bey yaşları toplamı 100 den büyük");
        System.out.println("selam javacanlar");//--> parantez olmadığı için if kapsamına alınmadı.

        /* Bağımısz if statement yapıları sadece kendi scop(kapsamlarını) run eder.
        Birden fazla bağımsız if statement yapıları hepsinin body çalışabileceği gibi hiçbirisini body de çalışmayabilir
         */

        //ctrl+alt+l-->code reformat java format



    }
}
