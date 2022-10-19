package j15_Arrays.ArrayTask;

import java.util.Arrays;

public class T06 {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */


        String str = "Javacilar cook afilli";
        str=str.toLowerCase().replaceAll("\\s","");
        String strArr[] = str.split("");
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        int count=0;
        for (int i = 0; 0 <strArr.length ; i++) {
            if (str.charAt(0) == str.charAt(i)) {
                count++;
            }

        }
    }}




