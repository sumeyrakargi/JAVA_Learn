package j02_DataTypes_WrapperClass;

public class C02_DataTypes {
    public static void main(String[] args) {
        /*
		 Java'da  2 farkli data type vardir.
		 1)Primitive Data Type (8 tane)

		   a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar

		   b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
		   		her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
		   		char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.

		   c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
		   		byte variable -> memory'de 8 bitlik alan kaplar.

		   d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
		   		short variable -> memory'de 16 bıt alan kaplar.

		   e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
		  		int variable -> memory'de 32 bit alan kaplar.

		   f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
		   		long variable -> memory'de 64 bit alan kaplar.

		   g)float : ondalikli sayilar icin kullanilır.
		   		float variable -> memory'de 32 bit kullanir.
		   		float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
		   		0.1234567
		   		Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.


		   h)double :  ondalikli sayilar icin kullanılır.
		   		double variable -> memory'de 64 bit kullanir.
		 		double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
		 		0.1234567890123456

		 2)Non-Primitive Data Type
		 	String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
		 */
        String name= "sumeyra";
        String yas= "13";
        int age = 36;
        boolean çalışanmi=true;
        boolean mimarmı=false;
        char sy='1';

        //TASK 1999 yılında doğan bir kişinin yaşını yazın

        int dtarihi=1999;
        int buyil=2022;
        int yasınız= buyil-dtarihi;
        System.out.println(2022-1999);
        System.out.println(yasınız);
        float f1=12.45f;
        float f2=23.56f;
        double boy=1.85;
        System.out.println(f1*f2);
        //TASK iki farklı byte tanımlayıp toplam farkı yazdırın
        byte x=12;
        byte y=109;
        System.out.println(x+y);
        System.out.println(y-x);

        //TASK iki farklı tam sayı türünde sayı tanımlayıp tolayın
       int c= 1453;
       byte d= 24;
        System.out.println(c+d);//1477



        //TASK tamsayı ve ondalıklı sayı tanımlayıp toplamını yazdırın

        int a=160;
        float b= 12.5f;
        System.out.println(a+b);

        //TASK tamsayı ve char data type iki variable tanımlayıp toplamını print edin.

       int z=450;
       char g ='5';
        System.out.println(z+g);

        //TASK ad ve soyadınızı yaşınızı yazdırınız
     String ad="Sumeyra";
     String soyad= "Yolcu";
     int yasim=36;
        System.out.println(ad+" "+soyad+" "+yasim);

    }
}
