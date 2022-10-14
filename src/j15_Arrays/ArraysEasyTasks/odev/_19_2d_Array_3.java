package j15_Arrays.ArraysEasyTasks.odev;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

        //---Birinci yol

        String smyra[][]={{"new jersey","atlanta","ohio"} , {"Pittsburgh" ,"ohio","new york","ohio"} ,
                {"ohio","new york"}};

        System.out.println(Arrays.deepToString(smyra).replaceAll("ohio","Florida"));

        //---İkinci yol





    }
}

