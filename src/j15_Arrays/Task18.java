package j15_Arrays;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {

        //Task--> sayı aarr deki iç arr lerin toplamını yeni bir arraye atayıp print eden code create edin
        // input :  int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}}
        // output: int yeniArr[]={6,11,-7}


        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};

        int yeniArr[]=new int[sayi.length];

        for (int i = 0; i < sayi.length ; i++) {

            int toplam=0;

            for (int j = 0; j <sayi[i].length ; j++) {
                toplam+=sayi[i][j];
            }yeniArr[i]=toplam;
            System.out.println(toplam);
        }
        System.out.println(Arrays.toString(yeniArr));//[6, 11, -7]
    }
}
