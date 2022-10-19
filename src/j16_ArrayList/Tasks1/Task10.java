package j16_ArrayList.Tasks1;


import java.util.ArrayList;
import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        ArrayList<Integer>sayı1=new ArrayList<>(Arrays.asList(1,2,2,3,1,4,2,5,6,8,7,5,9,1));
        ArrayList<Integer>sayı2=new ArrayList<>();


        for (int i = 0; i <sayı1.size() ; i++) {
            if (!sayı2.contains(sayı1.get(i))) {
                sayı2.add(sayı1.get(i));
            }}System.out.println(sayı2);
    }}
