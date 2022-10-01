package j11_Method_Creation.taskmethod;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner sc=new Scanner(System.in);
        System.out.print("Yıl giriniz :");
        int a=sc.nextInt();
        System.out.println(artıkyıl(a));

    }

    public static boolean artıkyıl(int a){

        boolean artıkyılmı;
    if ((a%4==0)      &&  (a %100!=0)  ||   (a%400==0) ){
        artıkyılmı=true;
    }else {
        artıkyılmı=false;
    }
return artıkyılmı;

    }
}
