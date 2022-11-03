import java.util.Scanner;

public class Q01_StringManupulation {
    public static void main(String[] args) {


//Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin


        Scanner sc = new Scanner(System.in);
        System.out.println("Isminizi ve soy isminizi giriniz");

        String firstName = sc.nextLine() , lastName=sc.nextLine();

        String fulName = firstName.concat(""+lastName).toUpperCase();
        System.out.println("fulName = " + fulName);








    }





}
