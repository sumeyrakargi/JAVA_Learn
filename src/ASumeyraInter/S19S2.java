package ASumeyraInter;

public class S19S2 {
    public static void main(String[] args) {
        //Prime number


        int sayi=15;
        boolean sonuç=false;
        for (int i = 2; i < sayi; i++) {

            if (sayi%i==0) {
                sonuç = true;
                break;
            }

            }if (!sonuç) {
            System.out.println(sayi + " sayısı asal sayı dır");
        }else System.out.println(sayi+ " sayısı asal sayı değildir.");
        }
}

