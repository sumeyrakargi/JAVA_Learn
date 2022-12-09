package projeler.P10_aracKiralama;

public class Runner {
    public static void main(String[] args) {
        MusteriVeArabaBilgisiGirisi veriGirisi = new MusteriVeArabaBilgisiGirisi();
        MusteriVeArabaBilgisiGirisi.aracTalep();
        veriGirisi.arabalar();
        veriGirisi.musteriBilgisi();
        veriGirisi.odemeBilgileri();


    }
}