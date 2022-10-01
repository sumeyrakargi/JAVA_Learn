package J03_ScannerClass.tasks3;

import java.util.Scanner;

public class smyr {

    /*
     1- kullanıcının ismini print eden code create ediniz

      Scanner sc=new Scanner(System.in);
      System.out.println("İsminizi giriniz : ");
      String isim= sc.next();

     2-  kullanıcının yasını print eden code create ediniz

       Scanner sc= new Scanner(System.in);
       System.out.println("Yaşınızı giriniz : ");
       int yaş= sc.nextInt();

     3-  kullanıcını sevdiği meyveyi print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("Sevdiğiniz meyveyi giriniz : ");
        String meyve= sc.next();

     4- kullanıcının arabansındaki kapı sayısını print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("Arabanızdaki kapı sayısını giriniz : ");
        int kapısayısı= sc.nextInt();

      5- kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.

        Scanner sc= new Scanner(System.in);
        System.out.println("On sene önce yaşadığınız şehri giriniz :");
        String şehir= sc.next();

      6- kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.

        Scanner sc= new Scanner(System.in);
        System.out.println("Doğum tarihinizi giriniz : ");
        int dtarihi= sc.nextInt();

      7-  kullanıcının boyunu
          Float print eden code create ediniz

        Scanner sc= new Scanner(System.in);
        System.out.println("Boyunuzu giriniz (m): ");
        Float boy= sc.nextFloat();

     8- Bir byte oluşturunuz.
        Konsola kg cinsinden bir ağırlık yazınız.
       Byte'ı yazdırınız.


        Scanner sc= new Scanner(System.in);
        System.out.println("Kilonuzu giriniz : ");
        byt e kilo= sc.nextByte();

     9-TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your mid-term grade : ");
        int mid= sc.nextInt();

        Scanner in =new Scanner(System.in);
        System.out.println("Enter your final grade : ");
        int finl= sc.nextInt();

        Scanner inpt =new Scanner(System.in);
        System.out.println("Enter your project grade : ");
        int prj= sc.nextInt();

        System.out.println((mid*0.3)+(finl*0.5)+(prj*0.2));


      10-  TASK ->

         Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         ve vucut kutle endeksini bulun.
         Sonucu tamsayi ve ondalikli sayi olarak yazdirin

         VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir

         Ornek : Input : boy :180 kilo : 80
                  Output : Vucut kutle endeksiniz : 24
                           Vucut kutle endeksiniz : 24.691…




        Scanner sc=new Scanner(System.in);
        System.out.println("Boyunuzu giriniz (cm) :" );
        int boy=sc.nextInt();

        Scanner in=new Scanner(System.in);
        System.out.println("Kilonuzu giriniz (kg) :" );
        int kilo=sc.nextInt();

        System.out.println("VKE:" + kilo/(boy*0.01*boy*0.01));

       11-  TASK->

        Kullaniciya gunde kac saat uyudugunu sorun,
        ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin

        Ornek : Input : 8
               Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor



        Scanner sc=new Scanner(System.in);
        System.out.println("Günde kaç saat uyuyorsunuz ?: ");
        int saat=sc.nextInt();

        System.out.println("Ayın " + saat*30/24+ " gününü uykuda geçiriyorsunuz" );
        System.out.println("Yılın " + saat*365/24+" gününü uykuda geçiriyorsunuz" );
        System.out.println("40 yılın " + saat*365*40/24+" gününü uykuda geçiriyorsunuz" );


       12- TASK ->
       Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
       bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.

       Scanner sc=new Scanner(System.in);
       System.out.println("Adınız : ");
       String ad= sc.next();

       Scanner s=new Scanner(System.in);
       System.out.println("Soyadınız : ");
       String sad= sc.next();

      Scanner n=new Scanner(System.in);
      System.out.println("Yaşınız : ");
      int yas= sc.nextInt();

     Scanner in=new Scanner(System.in);
     System.out.println("Kilonuz : ");
     int kg= sc.nextInt();

     Scanner i=new Scanner(System.in);
     System.out.println("Boyunuz : ");
     int boy= sc.nextInt();

     Scanner ss=new Scanner(System.in);
     System.out.println("Üyelik süresi (ay): ");
     int süre= sc.nextInt();

     System.out.println(ad+" "+sad+" "+yas+" "+kg+" "+boy+" "+süre+" "+"Toplam ücret: "+20*süre+" usd");

     13-// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

		Scanner sc=new Scanner(System.in);
		System.out.println("Sayı 1 için bir tamsayı değeri giriniz : ");
		int sayı1= sc.nextInt();
		System.out.println("Sayı 2 için bir tamsayı değeri giriniz : ");
	    int sayı2= sc.nextInt();

		System.out.println("Toplam değeri = " + (sayı1+sayı2));
		System.out.println("Fark = " + (sayı1-sayı2));
		System.out.println("Çarpım değeri = " + (sayı1*sayı2));
		System.out.println("Bölüm = "+ ((double)sayı1/sayı2));


      14-  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13

       Scanner sc= new Scanner(System.in);
       System.out.println("Üçgenin dik kenarlarından birinin ölçüsünü yazınız");
       int a= sc.nextInt();

      Scanner in= new Scanner(System.in);
      System.out.println("Diğer dik kenarlar ölçüsünü yazınız: ");
      int b= sc.nextInt();

      System.out.println("Hipotenüs = "+Math.sqrt((a*a)+(b*b)));

     15- Problem Tanımı
      Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
      Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
      120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.


    Scanner sc=new Scanner(System.in);
    System.out.println("İller arası mesafeyi giriniz : ");
    int a=sc.nextInt();

    Scanner in=new Scanner(System.in);
    System.out.println("Ortalama hızı giriniz : ");
    int b=sc.nextInt();

    System.out.println("Varış süresi : "+(a/b)+"saattir." );

   16- Kullanicidan alacaginiz vize1 vize2 ve final notlarini
    vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz


    Scanner sc=new Scanner(System.in);
    System.out.println("İlk vize notunuzu giriniz.: ");
    int v1= sc.nextInt();

    Scanner i =new Scanner(System.in);
    System.out.println("İkinci vize notunuzu giriniz.: ");
    int v2= sc.nextInt();

    Scanner n =new Scanner(System.in);
    System.out.println("Final notunuzu giriniz.");
    int fnl= sc.nextInt();

    System.out.println("Notunuz:"+ ((((v1+v2)/2)*0.3)+(fnl*0.7)));

   17- Problem Tanımı
    Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
    a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333


    Scanner sc=new Scanner(System.in);
    System.out.println("a sayısı giriniz: ");
    int a= sc.nextInt();

    Scanner i =new Scanner(System.in);
    System.out.println("b sayısı giriniz.: ");
    int b= sc.nextInt();

    Scanner n =new Scanner(System.in);
    System.out.println("c sayısı giriniz.");
    int c= sc.nextInt();

    System.out.println("Sonuç: "+(((a*a)-(b*b))/(3*c)));

    18-// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

    // formula

        // c = (f-32)*5/9



    Scanner sc=new Scanner(System.in);
    System.out.println("Hava sıcaklığını F cinsinden giriniz: ");
    int F= sc.nextInt();

    System.out.println("Hava sıcaklığı : "+(((F-32)*5)/9)+" C dir");








   */

}
