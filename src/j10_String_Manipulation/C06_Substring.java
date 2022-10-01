package j10_String_Manipulation;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {

        /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
        String str = "java bilen sırtı yere gelmez : )";
        System.out.println(str.substring(10));//Sırtı yere gelmez

        // str datasının son 10 karakterini print edin.
        System.out.println(str.substring(str.length() - 10));//gelmez


        // str datasının ilk 10 karakterini print edin.
        System.out.println(str.substring(0, 10));


        // str datasının ilk  karakterini print edin.
        System.out.println(str.substring(0, 1));// j->0 alıe 1 almaz yani 0. karakter ilk karakteri verir.

        //TASK -> Girilen dört harfli bir kelimeyi tersten yazınız.

        Scanner sc = new Scanner(System.in);
        System.out.println("Dört harfli bir kelime giriniz");
        String kelime = sc.next();

        if (kelime.length()!=4){
            System.out.println("agam sana 4 garfli gir demedik mi :(");
        }else{
            System.out.print(kelime.substring(kelime.length() - 1));//e
            System.out.print(kelime.substring(2,3));//l
            System.out.print(kelime.substring(1,2));//a
            System.out.print(kelime.substring(0,1));//k





    }
}}