package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {

    public static void main(String[] args) {

        //get()--> listte indexi belirtilen elemanı return eder.
        ArrayList<String>listsehir=new ArrayList<>(List.of("Münih","losAngles","Londra","Istanbul"));
        System.out.println(listsehir.get(1));//losAngles--> get indeksi belirtilen elemanı getirir
    }
}
