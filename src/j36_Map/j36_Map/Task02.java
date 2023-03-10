package j36_Map.j36_Map;

import java.util.HashMap;
import java.util.Map;



public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */

        Map<String, String> Adem = new HashMap<>();
        Adem.put("isim","Adem Alabas");
        Adem.put("email","ademalabas@gmail.com");
        Adem.put("adres","Erzincan");
        Adem.put("telefon","05432167897");
        System.out.println(Adem);

        System.out.println("Adem.get(\"isim\") = " + Adem.get("isim"));//Adem Alabas

        Adem.get("email");
        Adem.get("adres");
        Adem.get("telefon");

        Map<String,String>Sumeyra = new HashMap<>();
        Sumeyra.put("isim","Sumeyra Yolcu");
        Sumeyra.put("email","sumeyrayolcu@gmail.com");
        Sumeyra.put("adres","Bursa");
        Sumeyra.put("telefon","05447775252");

        Map<String,Map<String,String>>kartvizit= new HashMap<>();
        kartvizit.put("Adem",  Adem);
        kartvizit.put("Sumeyra",Sumeyra);
        System.out.println(kartvizit);
    }


}


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}

