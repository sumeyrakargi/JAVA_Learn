package j10_String_Manipulation;

public class C02_Lenght {
    public static void main(String[] args) {


        /*
        length()methodu girilen stringin uzunluğunu: içinde bulunan karakter sayısını return eder.
        bütün karakterleri (boşluk vs..) sayıp adedini verir.
         */
        String str="madem geldin dünyaya otur çalış javaya";
        int strKrktrsayısı=str.length();// int type bir data verir.
        System.out.println(str);//madem geldin dünyaya otur çalış javaya
        System.out.println(strKrktrsayısı);//38
        System.out.println(str.length());//38

        String str1="";
        System.out.println(str1.length());//0

        String str2=" ";
        System.out.println(str2.length());//1

        String str3=null;
        System.out.println(str3.length());//Run time error
        //TRICK->null atanan Stringler String method çalışmaz.
        /*
        null case sentetivedir. yani Null veya Null yazılamaz
        null bir değer değildir sadece hiçliği gösteren bir pointer (giriş işaretçi)
         */
        String name;//declare edilmiş ama atanmamış variable
        //name.concat(str1);






    }
}
