package J03_ScannerClass.tasks3;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner sc= new Scanner(System.in);
        System.out.println("Üçgenin dik kenarlarından birinin ölçüsünü yazınız");
        int a= sc.nextInt();

        Scanner in= new Scanner(System.in);
        System.out.println("Diğer dik kenarlar ölçüsünü yazınız: ");
        int b= sc.nextInt();

        System.out.println("Hipotenüs = "+Math.sqrt((a*a)+(b*b)));





    }
}
