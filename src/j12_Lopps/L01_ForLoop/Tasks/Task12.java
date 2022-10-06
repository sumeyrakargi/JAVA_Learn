package j12_Lopps.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        //Task --> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin toplamını hesap eden code create ediniz


        Scanner scan = new Scanner(System.in);
        int toplam=0;

        for(int i= 1; i<=5;i++){
            System.out.println(i+".sayi giriniz: ");
            int sayı = scan.nextInt();
            if(!(sayı<20 ||sayı >10)){
                toplam+=sayı;
            }
        }
        System.out.println("Toplam = " + toplam);


    }
}
