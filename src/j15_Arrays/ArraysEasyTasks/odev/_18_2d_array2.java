package j15_Arrays.ArraysEasyTasks.odev;

public class _18_2d_array2 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        int smyra[][]={{5,2,1},{10,2,3,6},{1,2}};
        int toplam=0;
        for (int i = 0; i <smyra.length ; i++) {
            for (int j = 0; j <smyra[i].length ; j++) {
                toplam+=smyra[i][j];

            }}
        System.out.println("Toplam :"+toplam);


    }
}