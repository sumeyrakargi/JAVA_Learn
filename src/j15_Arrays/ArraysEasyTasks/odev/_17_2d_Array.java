package j15_Arrays.ArraysEasyTasks.odev;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */


        //---Birinci yol

       int smyra[][]={{2,3,2},{4,1,5},{7,2,5}};

       System.out.println(Arrays.deepToString(smyra).replace('2','6'));

        //---İkinci yol

       for(int i=0; i<smyra.length; i++){
            for(int j=0; j<smyra[i].length; j++){
                if (smyra[i][j]==2) smyra[i][j]=6;
            }
        }System.out.println(Arrays.deepToString(smyra));
    }}
