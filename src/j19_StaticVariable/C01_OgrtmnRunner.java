package j19_StaticVariable;

public class C01_OgrtmnRunner {
    public static void main(String[] args) {
        C01_Ogrtmn hc1=new C01_Ogrtmn("cüneyt",11);
        System.out.println("hc1.tecrube = " + hc1.tecrube);
        System.out.println("hc1.isim = " + hc1.isim);
        //hc1.okul="kabadaş";//srtatic variable obje ile call edilmez.
        System.out.println("hc1.okul = " + hc1.okul);

        C01_Ogrtmn.okul="KABATAŞ ERKEK LİSESİ";//statik update edildi.

        C01_Ogrtmn hc2=new C01_Ogrtmn("Bekir",7);
        System.out.println("hc2.tecrube = " + hc2.tecrube);
        System.out.println("hc2.isim = " + hc2.isim);
        //hc2.okul="kabatas";
        System.out.println("hc2.okul = " + hc2.okul);

        C01_Ogrtmn hc3=new C01_Ogrtmn("nazım",13);
        System.out.println("hc3.tecrube = " + hc3.tecrube);
        System.out.println("hc3.isim = " + hc3.isim);
        //hc3.okul="gabatas";
        System.out.println("hc3.okul = " + hc3.okul);

        hc1.evlilikyıldonumu();//obj ile nanstatic method call
        C01_Ogrtmn.maashesapla(); //classname ile staticmethod call edildi.
        hc2.maashesapla();// obj ile staticmethod call edildi. bad practise.
    } }
