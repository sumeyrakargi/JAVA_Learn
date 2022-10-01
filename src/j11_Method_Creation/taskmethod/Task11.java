package j11_Method_Creation.taskmethod;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */

        Scanner sc=new Scanner(System.in);
        System.out.print("iletmek istediğiniz cümleyi giriniz :");
        String cümle=sc.nextLine();

       şifrele(cümle);
    }

    public static void şifrele(String cümle ){

        //System.out.println(cümle.replace('s', (char) 5).replace('a', (char) 4).
          //      replace('e', (char) 3).replace('i', (char) 1).replace('o', (char) 0));

        System.out.println(cümle.replaceAll("s","5").replaceAll("a","4").replaceAll("e","3").replaceAll("i","1")
                .replaceAll("o","0"));

    }


}