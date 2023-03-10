package projeler.P11_depoYonetimi.depoYonetimi05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;


public class urunCikisi implements Interface_Satis {

    public void urunCikisi() {
        System.out.print("Ürün ID giriniz : ");
        int urunID = Variables.scan.nextInt();
        int miktar;
        Set<Integer> keySets = Variables.urunlerMap.keySet(); // keyler
        Collection<List> valueSet = Variables.urunlerMap.values(); // value'lar List olarak
        for (Integer each : keySets) {
            if (each == urunID) {
                List<Urun> valuesList = new ArrayList<>();
                valuesList = Variables.urunlerMap.get(each);

                while (true) {
                    System.out.print("Ürün cikisi miktar : ");
                    miktar = Variables.scan.nextInt();
                    if (miktar > valuesList.get(0).getMiktar()) {
                        System.out.println("Depoda sadece " + valuesList.get(0).getMiktar() + " " + valuesList.get(0).getBirim() + " " +
                                valuesList.get(0).getUrunIsmi() + " bulunmaktadır.");
                    } else {
                        valuesList.get(0).setMiktar(miktar * (-1));
                        break;
                    }
                }

                Urun urunMiktarEksildi = new Urun(each, valuesList.get(0).getUrunIsmi(), valuesList.get(0).getUretici(), valuesList.get(0).getMiktar(),
                        valuesList.get(0).getBirim(), valuesList.get(0).getRaf());
                List<Urun> urunTanimlaList = new ArrayList<>();
                urunTanimlaList.add(urunMiktarEksildi);
                Variables.urunlerMap.put(each, urunTanimlaList);
            }
        }
        urunListele.urunListele();
    }
}
