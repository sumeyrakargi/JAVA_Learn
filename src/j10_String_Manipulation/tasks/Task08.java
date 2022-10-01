package j10_String_Manipulation.tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {



        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

String ad="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char h=harfDepo.charAt(harfDepo.indexOf("H"));
        char a=harfDepo.charAt(harfDepo.indexOf("A"));
        char l=harfDepo.charAt(harfDepo.indexOf("L"));
        char u=harfDepo.charAt(harfDepo.indexOf("U"));
        char k=harfDepo.charAt(harfDepo.indexOf("K"));

        System.out.println(h+a+l+u+k);//asciii->toplama-> 373
        System.out.println(""+h+a+l+u+k);//string->concat-> HALUK



System.out.println(" "+ad.charAt(ad.indexOf("S"))+ad.charAt(ad.indexOf("U"))+ad.charAt(ad.indexOf("M"))+ad.charAt(ad.indexOf("E"))+
                ad.charAt(ad.indexOf("Y"))+ad.charAt(ad.indexOf("R"))+ad.charAt(ad.indexOf("A")));



    }
}
