package interwiev;

import java.util.Scanner;

public class C2_MergeCertainCharacters {


    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir string giriniz :");
        String str = sc.nextLine();
        System.out.println("sayı giriniz");
        int sayi= sc.nextInt();

        System.out.println( ilkson(str, sayi));

    }
    private static String ilkson(String str, int sayi) {

        String son="";
        for (int i = 0; i <sayi ; i++) {
            String ilksonharf=str.substring(0,1)+str.substring(str.length()-1);
            son+=ilksonharf;
        }return son;
    }
}
