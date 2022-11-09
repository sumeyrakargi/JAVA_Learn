package ASumeyraInter;

import java.util.Scanner;

public class S12S2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        //Check whether an alphabet is Vowel or Consonant


        System.out.println("Lütfen bir String giriniz");

        String str= sc.nextLine();

        str= str.replaceAll("\\W","");
        str=str.replaceAll("\\d", "");


        for (int i = 0; i <str.length() ; i++) {

            if ((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='ı')||(str.charAt(i)=='o')||
                    (str.charAt(i)=='ö')||(str.charAt(i)=='u')||(str.charAt(i)=='ü')){
                System.out.println(str.charAt(i)+ " sesli harftir");
            }else System.out.println(str.charAt(i)+ " sessiz harftir");

        }

    }
}
