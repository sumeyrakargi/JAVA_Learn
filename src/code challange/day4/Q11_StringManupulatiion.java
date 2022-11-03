import java.util.Scanner;

public class Q11_StringManupulatiion {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("bir isim giriniz : ");
        String isim = scan.next();



        System.out.println("bir soyad giriniz : ");
        String isim2 = scan.next();

        System.out.println(isim.length() > isim2.length() ? "isminiz daha uzun " : "soyadiniz daha uzun");


    }










}
