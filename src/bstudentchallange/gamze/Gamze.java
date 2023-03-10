package bstudentchallange.gamze;

public class Gamze {

    /* "Var Mısın Yok Musun ?" oyunu oluşturalım.
            *
            * Oyunun mantığı : 10 tane kutu vardır, ve her kutunun içinde para miktarını gösteren bir sayı vardır.
            * Oyunu oynayan kişinin sahip olduğu bir kutu vardır.
            * Kalan 9 kutuyu sırasıyla açtırır ve her 3 kutu açtığında, yarışmanın sahibi tarafından teklifte bulunulur.
            * Oyuncu isterse teklifi kabul eder, isterse de oyuna devam edip kendi kutusundaki miktarı kazanabilir.
*
        * Örnek : 10 kutunun içinde rastgele olarak dizilmiş şu şekilde miktarlar olsun.
*
        * 1. Kutu : 1 TL
* 2. Kutu : 10 TL
* 3. Kutu : 500 TL
* 4. Kutu : 1000 TL
* 5. Kutu : 5000 TL
* 6. Kutu : 10000 TL
* 7. Kutu : 50000 TL
* 8. Kutu : 100000 TL
* 9. Kutu : 250000 TL
* 10. Kutu : 500000 TL
*
        * Bizim kutumuz 8. kutu olsun.
            *
            * Biz her seferinde kalan 9 kutudan birisini seçip açtıracağız, her üç kutu açtıktan sonra
* yapımcıdan teklif alacağız. Diyelim ki ilk 3 kutu açıldıktan sonra yapımcı bize 10.000 TL teklif etti,
            * istersek bunu kabul edeceğiz, istemezsek devam edeceğiz.
            *
            * Son kutu kalana kadar devam edebiliyoruz.
            *
            * 1. Adım : Önce 10 farklı para miktarını tutmak için List<Integer> paraListesi
*        adında ArrayList oluşturalım ve miktarları ekleyelim.
            *
            * 2. Adım : 10 Tane kutu oluşturalım ve her kutunun içine rastgele bir miktar atayalım.
*         Bu miktarları paraListesi adlı arrayList'imizden alalım.
            *         Bunun için Kutu isimli bir class oluşturalım.
            *         içerisine kutuNumarasi ve paraMiktari diye iki tane integer oluşturalım.
*
        *         ayrıca paraMiktarını ve kutuNumarasini almak için
*         "getter" methodlarımızı oluşturalım.
            *
            * 3. Adım : Kutuları ekleyebilmek, ve kutular üzerinde işlemler yapabilmek için Kutular classı oluşturulım
*         Oluşturduğumuz tüm Kutu nesnelerini Kutular a ekleyelim.
*         Bunun için Kutular class'ı içerisinde çeşitli methodlar oluşturalım.
            *         Ayrıca yapımcinin teklifini de bu class içerisinden alalım.
            *
            *         public void kutuEkle(Kutu kutu)
*         kalanKutuSayisiniAl()
*         kutulardakiToplamParaMiktari()
*         secilenKutuyuKutularListesindenKaldir(int kutuNumarasi)
*         public String acilmamisKutulariGoster()
*         public void kutuActir(int kutuNumarasi)
*         public int yapimcininTeklifAl()
*
        * 4. Adım : Oyunu başlatalım, kullanıcıdan seçmek istediği kutu numarasını alalım.
*
        */
}
