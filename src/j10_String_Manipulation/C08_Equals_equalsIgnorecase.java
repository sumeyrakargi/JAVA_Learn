package j10_String_Manipulation;

public class C08_Equals_equalsIgnorecase {
    public static void main(String[] args) {

        /* equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */
/**
 * str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
 * str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir
 */


 String str1="Merhaba";
 String str2="merhaba ";
        System.out.println(str1.equals(str2));//false
        System.out.println(str2.equals(str1));//false
        System.out.println(str2.equalsIgnoreCase(str1));//false--> str2 de bi boşluk  fazla olduğu i.in yine eşit olmaz

        System.out.println(str1.equalsIgnoreCase(str2));//false
        System.out.println(str2.equalsIgnoreCase(str1));//false

       String s1= "sümeyra hanım";//String pool
       String s2= "sümeyra hanım";//String pool
       String s3= new String("sümeyra hanım");// obj nonprimitive-->heapmemory
       String s4= new String("sümeyra hanım");// obj nonprimitive-->heapmemory

       System.out.println(s1==s2);//true
       System.out.println(s1.equals(s2));//true
       System.out.println(s3==s4);//false
       System.out.println(s3.equals(s4));//true



    }
}
