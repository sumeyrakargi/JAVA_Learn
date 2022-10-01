package j10_String_Manipulation;


public class C11_ValueOf_parse {

    public static void main(String[] args) {


        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.


        //-->TASK  STring type verilen iki adet bağış miktarını toplayan code create edin.

        String b1="1500";
        String b2="2500";

        int bagıs=Integer.valueOf(b1);
        int bagıs2= Integer.valueOf(b2);
        System.out.println(bagıs+bagıs2);

        //2.yöntem parseInt
        System.out.println( Integer.parseInt(b1) + Integer.parseInt(b2));

        int fetih=Integer.valueOf("1453");
        System.out.println(fetih);//1453


        //ystem.out.println("toplam bagıs : "+(Integer.parseInt(bagis1) + Integer.parseInt(bagis2)));//4000


        int tc=1234567;
        String strTc = String.valueOf(tc);
        System.out.println("strTc = " + strTc);//1234567
        System.out.println("strTc+tc = " + (strTc + tc));

        String  fiyat="$150";


        String a= fiyat.replaceAll("\\W","");
        int yeniFiyat=  Integer.valueOf(a);
        System.out.println("yeniFiyat = " + yeniFiyat);



    }
}
