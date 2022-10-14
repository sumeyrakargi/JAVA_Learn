package j15_Arrays.ArraysEasyTasks.odev;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        String smyr="Removes white space from both ends of a string";
        String smyrArr[]=smyr.split(" ");
        System.out.println("Kelime sayısı : "+smyrArr.length);//9
    }
}