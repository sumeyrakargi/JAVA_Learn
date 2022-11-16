package j33_interface.Tasksekil;

 /* Kare, Dikdortken, ve cember sınıflarından oluşacak bir geometri programı yapılmak isteniyor.
    bunların ayrı ayrı , fakat ortak metodlarının (cevresi() ve alani() )zorunlu olabilmesi için
    gerekli yapıyı kurunuz ve print ediniz....*/

public interface Sekil {
    double PI= 3.14;//final static variable
    int cevre(int ... boyut);//varargs parametreli abs.meth--> implements
    int alan(int ... boyut);//varargs parametreli abs.meth--> implements
}
