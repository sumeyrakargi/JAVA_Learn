import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz :");
        int num1= sc.nextInt();
        System.out.println("İkinci sayıyı giriniz :");
        int num2= sc.nextInt();
        System.out.println("Üçüncü sayıyı giriniz :");
        int num3= sc.nextInt();

        if (num1>num2&&num1>num3)
            System.out.println("En büyük sayı :"+num1);
        else if (num2>num1&&num2>num3) System.out.println("Enbüyük sayı :"+num2);
        else System.out.println("En büyük sayı :"+num3);

        if (num1<num2&&num1<num3)
            System.out.println("En küçük sayı :"+num1);
        else if (num2<num1&&num2<num3) System.out.println("En küçük sayı :"+num2);
        else System.out.println("En küçük sayı :"+num3);

    }
}

