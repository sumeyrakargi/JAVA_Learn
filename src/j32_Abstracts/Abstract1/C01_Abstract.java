package j32_Abstracts.Abstract1;

public class C01_Abstract {
    /*
    1- Bazı durumlarda child classlar parent class daki methodların bodylerini değiştirerek override ederler.
    bu gibi durumlarda parent class daki methoda body tanımlamak ram ve memory açısından sorunlu ve gereksizdir.çözüm olarak
    java parent class a bodysiz --> abstract (soyut)methodlar tanımlamıştır.

    2- Parent Class daki abstract methodlar aplication güvenliği açısından child class dan override edilmek zorundadır.
    Eğer parent class daki child class ın mutlaka kullanması gereken method varsa abstrac tanımlanmalı.

    3- Abstract method tanımlamak için
    a) {} body olmaz
    b) access modifie sonrası abstract keyword kullanılmalı
    c) abs method içinde abstract keyword ve {} birarada kullanılamaz .aksi halde CTE verir.

    abstract class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı

    4- Abs method sadece abs Class da tanımlanabilir kesinlikle concrete class da abs method  tanımlanamaz
    fakat abs class da cencrete method tanımlanabilir.

    5- Abs class içinde hem abs method hemde concrete method ve veriable tanımlanabilir.

    6- Bir concrete child class parent abs class extend ettiğinde abs methodları implement etmek zorunda ama
    concrete methodlar isteğe göre override edilir.

    7- parent child ilişkisi olan abs classlar abs methodları implement etmek zorunda değil.

    8- Parent olan abs class birden çok concrete veya abs child class extend edebilir ancak child class birden çok
    abs parent class dan extend edemez

    9- Abs Class da final ve abs method tanımlanamaz-->CTE verir.--> final method override edilemeyeceği için
    10- Abs Class da private ve abs method tanımlanamaz-->CTE verir.
    11- Abs Class da static ve abs method tanımlanamaz-->CTE verir.

    ***ABSTRACT CLASS ASLA KESİNLİKLE OBJE ÜRETEMEZ!!!!
    Trick--> abstract class lar referansı child class ın objesini tutabilir-->polimorphizm

     */
}
