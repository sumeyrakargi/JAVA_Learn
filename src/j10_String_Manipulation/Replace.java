package j10_String_Manipulation;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {

        // TASK : Kullanıcı tarafından girilen isim,soyisim  ve kart numarası bilgilerini ,yalnızca isimlerin ilk harfi ve
        // kart numarasının son dört hanesi görünür olacak şekilde print eden code create ediniz.

        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen isminizi arada tek boşluk bırakarak yazınız.");
        String isim = sc.nextLine();
        System.out.println("Lütfen soyisminizi yazınız.");
        String soyisim = sc.nextLine();
        System.out.println("Lütfen 16 haneli kart numaranızı yazınız.");
        String kartno = sc.nextLine();

        String isimson=isim.charAt(0)+isim.substring(1,isim.indexOf(" ")+1).replaceAll("\\w","*")+
                isim.charAt(isim.indexOf(" ")+1)+isim.substring(isim.indexOf(" ")+2).replaceAll("\\w","*");

        String soyisimson= soyisim.charAt(0)+soyisim.substring(1).replaceAll("\\w","*");

        System.out.println("İsim - Soyisim : "+isimson+" "+soyisimson );
        System.out.println("Kart numaranız : **** **** **** "+kartno.substring(12));


    }
}
