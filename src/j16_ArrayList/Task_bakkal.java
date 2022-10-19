package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_bakkal {


        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
       */

    static ArrayList<String>gunler=new ArrayList<>(List.of("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
    static ArrayList<Integer>günlükKazanclar=new ArrayList<>();

    public static void main(String[] args) {

        int i=0;
        while (i<gunler.size()){
            Scanner sc=new Scanner(System.in);
            System.out.println(gunler.get(i)+" günü kazancınızı giriniz :");
            double kazanç= sc.nextDouble();
           günlükKazanclar.add((int) kazanç);
           i++;
        }System.out.println(günlükKazanclar);

        System.out.println(getOrtalamaKazanc());
        getOrtalamaninUstundeKazancGünleri();
        getOrtalamaninAltindaKazancGünleri();
    }
    private static double getOrtalamaKazanc() {

        double toplam=0;
        for (int i = 0; i <gunler.size() ; i++) {
            toplam+=günlükKazanclar.get(i);
        }double ortalama=toplam/gunler.size();
       return ortalama;

    }private static void getOrtalamaninUstundeKazancGünleri() {
        ArrayList<String>ortalamaüstü=new ArrayList<>();
        for (int i = 0; i <gunler.size() ; i++) {
            if (günlükKazanclar.get(i)>getOrtalamaKazanc()){
               ortalamaüstü.add(gunler.get(i));
            }
        }System.out.println("ortalama üstü kazanç sağlanan günler :"+ortalamaüstü);
    }private static void getOrtalamaninAltindaKazancGünleri() {
        ArrayList<String>ortalamaaltı=new ArrayList<>();
        for (int i = 0; i <gunler.size() ; i++) {
            if (günlükKazanclar.get(i)<getOrtalamaKazanc()){
                ortalamaaltı.add(gunler.get(i));
            }}System.out.println("ortalama altı kazanç sağlanan günler :"+ortalamaaltı);
    }}
