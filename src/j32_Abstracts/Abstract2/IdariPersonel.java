package j32_Abstracts.Abstract2;

public class IdariPersonel extends Personal {

    @Override//mecbur implement edilmeli
    public void maasHesapla() {//Personal parent class dan override edildi
        System.out.println("iddareciye saat başı $120 ");
    }

    @Override//mecbur implement edilmeli
    public void maasBilgisi() {//Personal parent class dan override edildi

        System.out.println("clean code yazan idari personele extra 2 saat ücret");
    }

    @Override
    public void sigorta() {

    }
}
