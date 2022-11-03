package bstudentchallange;

public class C04 {
    /*
Bir Stringde ilk uniq karakteri bulup return eden method create ediniz.
Ex:
String str1="AAABBBCCCDEF";
String uniqf="D";
 */
    public static void main(String[] args) {
         String a="AABBTTCCCHGGTTRRMM";

        for (int i = 0; i <a.length(); i++) {
            if (a.indexOf(a.charAt(i)) == a.lastIndexOf(a.charAt(i))){
                System.out.println(a.charAt(i));
                break;

            }

        }
    }


}
