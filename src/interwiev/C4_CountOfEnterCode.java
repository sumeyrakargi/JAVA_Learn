package interwiev;

import java.util.Scanner;

public class C4_CountOfEnterCode {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {

       String pin="sumeyra12345";
       int girishakkı=4;

       Scanner sc= new Scanner(System.in);
       System.out.println("***Hoşgeldiniz***");
        while (true){

            System.out.println("pin kodunu giriniz");
            String girilenpin=sc.nextLine();

            if (pin.equals(girilenpin)){
                System.out.println("Başarılı giriş yaptınız");
                break;
            }else {
                System.out.println("Yanlış giriş yaptınız");
                girishakkı--;
                System.out.println("Kalan giriş hakkınız :"+girishakkı);
            }if(girishakkı==0){
                System.out.println("Giriş hakkınız kalmadı\nSim kartınız bloke oldu");
            }
        }}}

