package j11_Method_Creation.taskmethod;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner sc=new Scanner(System.in);
        System.out.print("saat giriniz :");
        int a=sc.nextInt();

        System.out.println(çevir(a));
    }
    public static int çevir(int a){

       return (a*3600);
    }


}
