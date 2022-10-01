package j10_String_Manipulation;

import javax.swing.*;
import java.util.Scanner;

public class C07_IndexOf_LastIndexOf {
    public static void main(String[] args) {


        /* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false
*/

String str="Good";
        System.out.println("ilk görülen o nun yeri index nosu:"+str.indexOf('0'));//1
        System.out.println("d nin yeri index nosu"+str.indexOf("d"));//3
        System.out.println("d nin yeri index nosu"+str.indexOf("D"));//-1 D karakteri olmadığı için
        //Trıck--> olmayan karakter indexi sorgulanırsa -1 return eder.

        System.out.println("od un yeri index nosu"+str.indexOf("d"));//2
        System.out.println("od un yeri index nosu"+str.indexOf("Od"));//-1

        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String name="sümeyrabera";
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.indexOf("ra"));

        /*
          task
         Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz
        1-Girilen cumle java icermiyor
        2-Girilen cumle 1 tane java iceriyor
        3-Girilen cumlede birden fazla java var
        */

        Scanner sc= new Scanner(System.in);
        System.out.println("bir cümle giriniz:");
        String cümle= sc.nextLine().toLowerCase();

        if (cümle.indexOf("java")==-1) {
            System.out.println("Girilen cümle java içermiyor");
        }else if (cümle.indexOf("java")==cümle.lastIndexOf("java"))
            System.out.println("Girilen cümle 1 tane java içeriyor.");
        else System.out.println("Girilen cümlede birde çok java var");

        }
    }

