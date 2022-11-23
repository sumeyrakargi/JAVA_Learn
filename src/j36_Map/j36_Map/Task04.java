package j36_Map.j36_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task04 {

    ///			KELİME ANALİZİ

    /*
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle=sc.nextLine();
        String[]kelimeler=cumle.split(" ");

        HashMap<String,Integer>kelimelist=new HashMap<>();
        for (int i = 0; i <kelimeler.length ; i++) {

            if(kelimelist.get(kelimeler[i])==null){
            kelimelist.put(kelimeler[i],1);
            }else {
                int num=kelimelist.get(kelimeler[i]);
                kelimelist.put(kelimeler[i],num+1);
            }
        }
        System.out.println(kelimelist);
        for (String c : kelimelist.keySet()) {//key
            System.out.print(c + " : " + kelimelist.get(c) + " ");

        }
}}
