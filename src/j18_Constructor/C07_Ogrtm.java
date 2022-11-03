package j18_Constructor;

public class C07_Ogrtm {
    String isim;
    int tecrube;
    int kıdem=5;

    public C07_Ogrtm(String isim, int tecrube) {//2p'li cons.'
        this.isim = isim;
        this.tecrube = tecrube;
    }
    public void kıdemhesapla(int kıdem){
        System.out.println("agam kıdemin"+ (kıdem*2));
        System.out.println("agam kıdemin "+(this.kıdem*2));
    }

}