package j20_PassBYValue;

public class C01_PassByValue {
    /*
    Java Pass By value bir programlama dilidir.
    Bir primitive variable argument olarak bie methoda call edildiğinde variable değil bir copy clone (pointer) değeri gönderilir
     */
    public static void main(String[] args) {
        //task --> verilen fiyat için %24 artırılmış fiyatı print eden metod create ediniz.
        double fiyat=100;
        System.out.println(" Artış öncesi fiyatı :"+ fiyat);//100
        fiyatartır(fiyat);//124
        System.out.println("method call sonrası :"+fiyat);//100
    }

    public static void fiyatartır(double ürün){
        ürün *=1.24;
        System.out.println("Artırılmış fiyat :"+ürün);

    }

}
