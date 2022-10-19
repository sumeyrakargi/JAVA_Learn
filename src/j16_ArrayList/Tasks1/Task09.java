package j16_ArrayList.Tasks1;

import java.util.ArrayList;
import java.util.Arrays;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        ArrayList<Integer>sayi = new ArrayList<>(Arrays.asList(12,23,25,65,41,2,14));
        ArrayList<Integer>sayikare = new ArrayList<>(Arrays.asList());
        int karetoplam=0;

        for (int i = 0; i <sayi.size() ; i++) {
            sayikare.add(sayi.get(i)*sayi.get(i));
            karetoplam+=sayi.get(i)*sayi.get(i);
        }
        System.out.println("sayikare = " + sayikare);
        System.out.println("karelerin toplamı : "+karetoplam);

    }
}

