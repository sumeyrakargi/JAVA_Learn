package j18_Constructor;

public class C02_Arac {

    String marka;
    String model;
    int km;
    double motorhacim;
    boolean vitesAuto=false;
    boolean vitesBrake=false;
    boolean ikinciel;
    int yıl;
    String renk;

    public static void main(String[] args) {

        C02_Arac arac1= new C02_Arac();
        arac1.ikinciel=true;
        arac1.marka="volvo";
        arac1.model="xc60";
        arac1.km=50000;
        arac1.motorhacim=2.4;

        System.out.println(arac1.marka + " " + arac1.model + " " + arac1.km + " " + arac1.yıl + " " + arac1.ikinciel + " " + arac1.motorhacim);
     //                         volvo             xc60             50000               default             true                      2.4

        //2. bir aracın tüm field larını atayarak print ediniz

        C02_Arac aracım=new C02_Arac();
        aracım.ikinciel=true;
        aracım.marka="volvo";
        aracım.model="s80";
        aracım.km=100000;
        aracım.motorhacim=2;
        aracım.renk="beyaz";
        System.out.println(aracım.marka + " " + aracım.model+" " +aracım.renk+ " " + aracım.km + " " + aracım.yıl + " " + aracım.ikinciel + " " + aracım.motorhacim);





    }
}
