package j19_StaticVariable;

public class FaturaRunner {
    public static void main(String[] args) {

        ElectricHesap h1 = new ElectricHesap();
        ElectricHesap h2 = new ElectricHesap();
        Musteri musteri = new Musteri("sümeyra",h1);
        Musteri musteri2 = new Musteri("Murat",h2);
        h1.tüketimekle(250);
        h1.tüketimekle(350);
        h2.tüketimekle(550);
        h2.tüketimekle(750);
        System.out.println(musteri.name + " Toplam tüketim "+h1.toplamTuketim);
        System.out.println(musteri.name + " Ödenecek tutar: " + h1.odenecekTutar() + " TL");
        System.out.println(musteri2.name + " Toplam tüketim "+h2.toplamTuketim);
        System.out.println(musteri2.name + " Ödenecek tutar: " + h2.odenecekTutar() + " TL");




    }
}
