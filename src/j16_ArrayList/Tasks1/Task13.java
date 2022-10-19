package j16_ArrayList.Tasks1;

import java.util.ArrayList;
import java.util.Arrays;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        ArrayList<Integer>sayı = new ArrayList<>(Arrays.asList( 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 ));
        ArrayList<Integer>sayı2 = new ArrayList<>(Arrays.asList());

        int toplam=0;
        int count=0;
        for (int i = 0; i <sayı.size();) {
            sayı2.add(sayı.get(i));
            toplam+=sayı.get(i);
            for (int j = 0; j <sayı.size() ; j++) {

            }

        }
        System.out.println(sayı2);



    }
}

