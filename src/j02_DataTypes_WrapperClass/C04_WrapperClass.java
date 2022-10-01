package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String name="Sümeyra";
        int yas=36;

        System.out.println(name.toUpperCase());//SÜMEYRA yazdırır

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.

        String tc = "12345";
        String id = "98765";

        int yenitc = Integer.valueOf(tc); // tc String değerini int e çevirdi ve yeni, tc ye atadı
        System.out.println("yenitc = " + yenitc);//  <--yenitc.soutv dediğimizde oluşan sonuç


        int yeniid = Integer.valueOf(id); // id String değerini int e çevirdi ve yeni, id ye atadı
        System.out.println("yeniid = " + yeniid);

        //TASK id ve tc String değerlernin toplamını print eden code yazınız

        System.out.println("toplam tc ve id=" +yenitc+yeniid);//aritmetik toplama yapar
        String okulno="2345431";
        int yenino=Integer.valueOf(okulno);
        System.out.println("yenino = " + yenino); //yazmadı,runtime error verdi çnlü l harfi rakam değil

        //TASK byte short int max ve min değerlerini print eden kod yazınız.

       byte maxBytedeğeri=Byte.MAX_VALUE;
       byte minBytedeğeri=Byte.MIN_VALUE;
        System.out.println("maxBytedeğeri="+maxBytedeğeri);
        System.out.println("minBytedeğeri="+minBytedeğeri);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);// Int seçilir ve . konulup maxvalue seçilir tekrar. konup soutv seçilir
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        int a=5;
        System.out.println(a);//5
        System.out.println(5);//5





    }
}
