package j12_Lopps.L01_ForLoop.Tasks.Tasks;

import java.util.Scanner;

public class Odev05 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {
       // Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Scanner sc = new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int sayi = sc.nextInt();
        System.out.println(üçünkuvveti(sayi));

    }
    private static boolean üçünkuvveti(int sayi) {

        boolean kuvvetimi=true;
        for (int i=3; i<=sayi;i*=3) {
            if (sayi%i !=0) kuvvetimi = false;
        }
        return kuvvetimi;
    }


    }

