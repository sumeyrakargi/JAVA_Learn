package j15_Arrays.ArraysEasyTasks.odev;

import java.util.Arrays;

public class _20_Arrayboth_Ends {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */

        int smyr[]={2,9,3,5,20,42,45};
        int yenismyr[]={smyr[0],smyr[smyr.length-1]};
        System.out.println(Arrays.toString(yenismyr));

    }
}