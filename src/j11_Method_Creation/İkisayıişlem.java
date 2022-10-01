package j11_Method_Creation;

import java.util.Scanner;

public class İkisayıişlem {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int a=scanner.nextInt();
        System.out.println("İşlem Giriniz(+,-,*,/)");
        char islem=scanner.next().charAt(0);
        System.out.print("Baska Sayi Giriniz : ");
        int b=scanner.nextInt();
        hesapla(a,b,islem);

    }

    private static void hesapla(int a, int b, char islem) {
        switch (islem){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("yanlış karakter girdiniz");
                break;
        }
    }
}
