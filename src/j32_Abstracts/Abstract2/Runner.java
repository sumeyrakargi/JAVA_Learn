package j32_Abstracts.Abstract2;

import j26_Inheritance.inheritance1.Paluk;

public class Runner {
    public static void main(String[] args) {
        İsci isci1= new İsci();
        isci1.maasBilgisi();
        isci1.maasHesapla();
        isci1.name="Ebubekir Bey ";
        System.out.println(isci1.name);
        isci1.sigorta();//Özel sigorta kapsamındasınız

        Personal cncCdr= new IdariPersonel();
        cncCdr.name="Sumeyra QA Tester";
        cncCdr.sigorta();
        System.out.println(cncCdr.name);//Sumeyra QA Tester
        cncCdr.maasBilgisi();//clean code yazan idari personele extra 2 saat ücret
        cncCdr.maasHesapla();//iddareciye saat başı $120
    }
}
