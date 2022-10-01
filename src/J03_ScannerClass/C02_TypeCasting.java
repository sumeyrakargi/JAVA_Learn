package J03_ScannerClass;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {

        /*
         byte < short < int < long < float < double
         Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina
         java  otomatik olarak yapar.*/

        boolean basarılı=true;
        //String basarı=basarılı; --> doğal uyum olmayan variable larda casting yapılmaz CTE
        // System.out.println("basarılı = " + basarılı);-> true
        // System.out.println("basarı = " + basarı);->true
        double d = 17;// double variable'a int 17 atandı k->b
        System.out.println("d = " + d);//d = 17.0 auto widding

        int sayı1=33;
        int sayı2=7;
        System.out.println(sayı1/sayı2);// 4
        //java iki int sayıyı böldüğümüzde sonucu int verir. bölme işleminde ondalıklı sonuç çıkarsa ondalık kısmı siler.


        byte b=127;
        int i=b;// aw yapıldı
        System.out.println("i="+i);//127

        int num=1453;
        double d1=num;//aw
        System.out.println("d1="+d1);//1453.0
        double db=d1/num;// TRICK iki farklı data type sayı işleme girerse java küçük olan data type türü için aw yapar
                         //   sonucu büyük olarak verir.

        /*
          byte < short < int < long < float < double
          Explicit Narrowing Casting ->Buyuk data type'larini kucuk data type'larina cevirme islemini veri kaybndan dolayı
          Java otomatik olarak yapmaz. kod ile teyit ister...*/

        double d2 =14.53;
        int num2=(int) d2;
        System.out.println("num2"+num2);//14
        int num3=150;
        byte b1= (byte)num3;
        System.out.println("b1="+b1);//b1=-106

        double d3= 333;
        long l= (long)d3;
        System.out.println(l);

        double d4= 571.4444;
        long l2=(long)d4;
        System.out.println("l2="+l2);


        Scanner sc= new Scanner(System.in);
        System.out.println("ascii değeri istediğin karakteri gir:");
        char ch =sc.next().charAt(0);
        int a=ch;
        System.out.println(a);

    }
}
