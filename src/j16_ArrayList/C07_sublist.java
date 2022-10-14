package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_sublist {

    public static void main(String[] args) {
        //sublist()--> listten istenen list parçasını return eder

        ArrayList<String> listşehir=new ArrayList<>(List.of("Münih","losAngles","Bursa","Londra","samsun","istanbul"));
        System.out.println(listşehir.subList(1, 3));//[losAngles, Bursa]--> 1.indexten 3 ekadar,3 dahil değil

        ArrayList<String>citylist=new ArrayList<>(listşehir.subList(2,5));
        System.out.println(citylist);//[Bursa, Londra, samsun]--> listşehrin 2.indeksinden 5 e kadar olanı ile oluşturuldu

    }
}
