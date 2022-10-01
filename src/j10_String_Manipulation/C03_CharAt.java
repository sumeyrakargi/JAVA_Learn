package j10_String_Manipulation;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {

        /*
        charAt()methodu parametre int olarak girilen index'deki char değerini return eder.
        index değeri 0'dan başlar
         */
        String sehir= "İstanbul";
        System.out.println("sehir.charAt(5) = " + sehir.charAt(5));//b
        char beşinciİndexKrktr=sehir.charAt(5);
        System.out.println(beşinciİndexKrktr);//b

        //son index karakteri--> lwngth()-1
        System.out.println( sehir.charAt(sehir.length()-1));//l
        //ilk ,index karakteri--> charAt(0)

        System.out.println(sehir.charAt(0));//İ
        //System.out.println(sehir.charAt(18));--> Rte verir.karakterden fazla girildiğinde
        //TRICK--> charAt () index boyutunu aşarsa Rte verir.

        //TASK__> İstanbul kelimesinin ortadaki karakteri print eden code create ediniz

        String city="istanbul";
        city.charAt(city.length()/2);

        Scanner sc= new Scanner(System.in);
        System.out.println("bir kelime yazın.");
        String kelime= sc.next();

        if (kelime.length()%2!=0)
            System.out.println(kelime.charAt(kelime.length()/2));
        else System.out.println("girilen kelimenin orta karakteri yok");






    }
}
