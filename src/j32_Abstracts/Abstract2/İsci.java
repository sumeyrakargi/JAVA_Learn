package j32_Abstracts.Abstract2;

public class İsci extends Personal{
    @Override//mecbur implement edilmeli
    public void maasHesapla() {//Personal parent class dan override edildi
        System.out.println("yevmiye 500 yevme");
    }

    @Override//mecbur implement edilmeli
    public void maasBilgisi() {//Personal parent class dan override edildi

        System.out.println("Günde sekiz saat çalışma");
    } //abs Personel parent clasa extend.


}
