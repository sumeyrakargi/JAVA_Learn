package j10_String_Manipulation.tasks;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz.");
        String kelime= sc.next();
        if (kelime.length()%2-1!=0)
            System.out.println(kelime.substring(0,kelime.length()/2));
        else System.out.println("Girilen kelimenin ikiye bölünemeyecek harf sayısı içermektedir.");


    }
}


