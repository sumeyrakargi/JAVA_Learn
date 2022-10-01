package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {

    public static void main(String[] args) {
        // 1.yol -> best practice (reccomended)tavsiye edilen
        int yas= 36;
        int maas= 33000;
        System.out.println("yas");// yas yazar
        System.out.println(yas);//48 yazar
        System.out.println(maas);//33000 yazar
        System.out.println("nur hanım baslangıc maası:"+maas);//nur hanım basşangıc maası :33000

        //2.yol
        int boy; //degeri atanmayan boy isminde bir int tanımlandı declaration
        // System.out.println(boy);// değeri atanmamış değişkeni hiç bir aksiyonda kullanılmaz CTE
        boy=175;
        System.out.println("boyunuz:"+boy);//175 yazar
        int yevmiye,age,kilo;//birden çok değişken tanımlandı
        age=33;
        yevmiye=1000;
        kilo=60;//tanımlanan değişkenlere değer ataması yapıldı
        int gunluk=1500; // yevmiye yazınca hata verdi ,yevmiyeyi günlük olarak yazıp farklı veri girişi yapılmalı
        //TRICK bir variable sadece bir kez tanımlanabilir ama birden çok değer atanabilir
        int  yıl=2022 ,agirlik=80;
        System.out.println(gunluk);//1500
        gunluk=1800;//gunluk yeni değeri 1800 olarak atandı
        System.out.println("gunluk son değeri:"+gunluk);//1800
     }
     }