package j12_Lopps.L01_ForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {



        /*Eğer bir döngünün body'sinde başka bir döngü bulunuyorsa bu tür döngülere nested-loop->içiçe dögü denir
        iç döngü dış döngünün her adımında tekrar çalışır.
        iç içe döngülerde en içteki döngü en önce çalışır.*/

        for (int apt=1; apt<=10;apt++){
            System.out.println("apartman döngü :"+apt);
            for (int daire=1;daire<6;daire++){
                System.out.println("apt"+apt+"daire:"+daire);
            }
        }


    }
}
