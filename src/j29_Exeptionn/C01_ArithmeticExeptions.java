package j29_Exeptionn;

import java.util.Scanner;

public class C01_ArithmeticExeptions {

    public static void main(String[] args) {

        //ArithmeticExeption
        String str="";
        //str.charAt(2);//RTE--> IndexOutOfBoundsExeption

        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi1=sc.nextInt();

        System.out.println("Lütfen ikinci bir sayı giriniz");
        int sayi2=sc.nextInt();

        int oran;//RTE--> ArithmeticExeption/byZero

        try {//dene--> hatanın olma ihtimali olduğu code bloğu
            /*
            1-try-catch kullanıldığında try block hatasız çalışırsa catch block asla çalışmaz. catch block try block exeption hata yaklarsa çalşır
            2-try block catch veya finally block olmadan CTE veri.try block tan sonra birden fazla catch block tanımlanabilir.
            aynı sadece bir catch block çalışabilir hiç bir catch çalışmaya da bilir.
            3-parent-child ilişkisi olan catch lerde child önce yazılmalı aksi halde CTE.
             */
            oran=sayi1/sayi2;
            System.out.println(oran);
            System.out.println("try block tan selamlar");
        }
        catch (ArithmeticException falan){//child exeption
            System.out.println("0 böler mi hiç"+ falan.getMessage());//Exeption oluştuğunda sadece hata mesajı print eder
            falan.printStackTrace();//oluşan Exeption  tüm detay bilgisini print etmek için kullanılır.
            System.out.println("şu an çırak yani child catch den çalışıyoruz");
        }
        catch (ArrayIndexOutOfBoundsException arrayExc){
            System.out.println("Array de olmayan eleman istedin");
        }
        catch (Exception mesela) {//Exeption Class tüm exeptionların atasıdır.
            // hata yakalandığında yapılacak aksiyonların olduğu block.
            //Exeption--> oluşan hata Data type
            //mesela--> java nın oluşan exeption a atayacağı obj name,best practice->e.
            System.out.println("0 böler mi hiç");
            System.out.println("catch block tan selamlar");
        }
        finally {//catch blocklardan sonra istenirse finally block kullanılabilir.
            /*
            try-catch içine yapılan işlemlerden sonra mutlaka çalışması gereken block varsa finally tanımlanır. hata durumunda
            catch çalışmaz ise pr sonlanır ama finally tanımlanırsa catch çalışmasa bile pr akışı devam eder.
            finally bloct hata olsa da olmasa da çalışır.
            Cloud database ortamlarında bağlantı kesmek için kullanılır. cloud ile connection yazıldığında code başarılı bir şekilde
            çalışırsa işlem bittiğinde finally block ile connection kapanmasa pahalıya patlar:)
             */
            System.out.println("finally blocktan selmalar");
        }
        // catch(ArithmeticExeption falanfilan)-->chil exeption parent exeption (Exeption mesela) den sonra tanımlandığı için CTE
       //
        System.out.println("devam");
    }

}
