package j15_Arrays.ArraysEasyTasks.odev;

import java.util.Arrays;

public class _13_Advance_zeroFront {

    public static void main(String[] args) {

      /*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */
        int arr[] = {0,4,6,0,1,0,0,1,6,1,7,0,1,0};
      Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 4, 6, 6, 7]
    }
}