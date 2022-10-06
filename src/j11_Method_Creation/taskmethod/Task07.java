package j11_Method_Creation.taskmethod;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci sayıyı seçiniz:");
        int a=sc.nextInt();
        System.out.print("İkinci sayıyı seçiniz:");
        int b=sc.nextInt();
        System.out.print("Üçüncü sayıyı seçiniz:");
        int c=sc.nextInt();
       küçük(a,b,c);
    }
    public static void küçük(int a,int b,int c){
        if (a<b&&a<c) {
            System.out.println("En küçük olan sayı :" + a);
        } else if (b<a&&b<c){ System.out.println("En küçük olan sayı :" + b);

        } else if (c<a&&c<b){ System.out.println("En küçük olan sayı :" + c);

        }else System.out.println("Yanlış giriş yaptınız.");
    }

    }

