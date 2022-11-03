package j18_Constructor;

public class C07_OgrtmRunner {
    public static void main(String[] args) {
        C07_Ogrtm hcm=new C07_Ogrtm("Sevdenur Öğretmen",11);
        System.out.println("hcm.isim = " + hcm.isim);
        System.out.println("hcm.kıdem = " + hcm.kıdem);
        hcm.kıdemhesapla(13);
    }
}
