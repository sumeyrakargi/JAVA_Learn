package j15_Arrays.ArraysEasyTasks.odev;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String smyr="Hello World";
        for (int i = smyr.length()-1; i >= 0; i--) {
            System.out.print(smyr.charAt(i));//dlroW olleH
        }

}
}