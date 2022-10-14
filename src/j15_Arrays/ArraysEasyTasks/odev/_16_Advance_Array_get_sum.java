package j15_Arrays.ArraysEasyTasks.odev;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        String usd= "$12 $23 $10 $2 $5 $2";
        String usdarr[]=usd.split(" ");

        int toplamusd=0;
        for (int i = 0; i < usdarr.length; i++) {
            toplamusd += Integer.parseInt(usdarr[i].replace("$", ""));
            }System.out.println("Toplam dolar"+toplamusd);//Toplam dolar54
    }
}