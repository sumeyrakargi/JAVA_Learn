import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Aldığınız ürün adedini giriniz:");
        int ürün= sc.nextInt();
        System.out.println("Ürünün liste fiyatını giriniz");
        int fiyat= sc.nextInt();
        System.out.println("Müşteri kartınız var ise E yok ise H giriniz");
        char kart=sc.next().charAt(0);
        if (kart=='E'){
           if (ürün>=10) System.out.println("Toplam tutar:" +(fiyat-(fiyat*0.2)+"liradır"));
           else System.out.println("Toplam tutar:"+(ürün*(fiyat-(fiyat*0.15))+"liradır"));
        } else if (ürün>=10)System.out.println("Toplam tutar:" +(ürün*(fiyat-(fiyat*0.15))+"liradır"));
           else System.out.println("Toplam tutar:" +(ürün*(fiyat-(fiyat*0.1))+"liradır"));




    }

}
