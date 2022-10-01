package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {

        String ad="Sumeyra";
        String soyad="Yolcu";

        int a=7;
        int b=11;

        // Birden çok String variable ile farklı data type  variable'ler + ile işleme alınırsa
        // java birleştirme yaparak yeni bir String oluşturur.( 1 ile 2 yi birleştirince 12, toplayınca 3 olur)

        System.out.println(ad+soyad+a+b);// -->SumeyraYolcu711

        System.out.println(a+ad+soyad+b);// -->7SumeyraYolcu11

        System.out.println(a+b+ad+soyad);//-->18SumeyraYolcu

        System.out.println(" "+a+b);// --> 711

        System.out.println(ad+soyad+(a+b));//-->SumeyraYolcu18

        System.out.println((a+b)+ad+soyad);//-->18SumeyraYolcu

        System.out.println(ad+(a-b)+(a-b));//-->Sumeyra-4-4

        System.out.println(ad+((a-b)+(a-b)));//-->Sumeyra-8

        char ch='1';//

        System.out.println(ad+ch);// Sumeyra1 (stringden sonra char karakteri alınır)

        System.out.println(a+ch+ad);//56Sumeyra  (1 in asci degeri alınır ,a ile toplanır)

        System.out.println(ad+(ch+b));//Sumeyra60

        System.out.println(a+ad+ch);//7Sumeyra1  (stringden sonra char karakteri alınır)

        /* TRICK char data türü işleme girdiği variables in türüne göre farklı işlem yapar,eğer işleme girdiği
         variables aritmetik işlemse ascii değeri ile işlem yapar
           TRICK Bir aritmetil işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre işlem yapılıp
         String variable a Concatenation yapılır.*/
    }


}
