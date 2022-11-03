package j20_PassBYValue;

public class C02_PassBYValue {
    public static void main(String[] args) {
        //task-->verilen fiyat için %11,%22,%33 indirimli fiyat veren method create ediniz

        double fiyat=100;

        System.out.println("indirim11(fiyat) = " + indirim11(fiyat));//89
        System.out.println("indirim22(fiyat) = " + indirim22(fiyat));//78
        System.out.println("indirim33(fiyat) = " + indirim33(fiyat));//67
        System.out.println("method sonrası: "+fiyat);//100
    }

    private static double indirim11(double fiyat) {
        return fiyat*=0.89;
    }
    private static double indirim22(double fiyat) {
        return fiyat*=0.78;
    }
    private static double indirim33(double fiyat) {
        return fiyat*=0.67;
    }
}
