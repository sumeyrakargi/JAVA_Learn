package j11_Method_Creation.taskmethod;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */


        Scanner sc=new Scanner(System.in);
        System.out.print("Saatlik çalışma ücretinizi giriniz :");
        double ücret=sc.nextDouble();
        System.out.print("Mesaiye başmala saatinizi giriniz :");
        double  baş=sc.nextDouble();
        System.out.print("Mesaiyi bitirme saatinizi giriniz :");
        double son =sc.nextDouble();
        System.out.print("Fazla mesai ücretini mesai ücretine oranını giriniz :");
        double kat=sc.nextDouble();
        double toplamkazanç=kazanç(baş,son,ücret,kat);
        System.out.println("Toplam kazancınız ="+toplamkazanç);
    }
    public  static double kazanç(double baş,double son, double ücret,double kat){

        double kazanç=((son-baş-8)*kat*ücret)+(8*ücret);
        return kazanç;



    }

}
