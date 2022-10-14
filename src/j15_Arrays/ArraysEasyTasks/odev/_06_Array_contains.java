package j15_Arrays.ArraysEasyTasks.odev;

import java.util.Arrays;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        String frt[]={"Apple","Orange","Banana","Pineapple"};

        //Birinci yöntem

        if (Arrays.toString(frt).contains("Apple"))
            System.out.println(true);
        else System.out.println(false);

        //İkinciyöntem

        for (int i = 0; i < frt.length; i++) {
            if (frt[i].equals("Apple")){ System.out.println(true);
            }else System.out.println(false);;//true
        }
    }
}
