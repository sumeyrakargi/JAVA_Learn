package code_challange.lambdaCodeChallenge;
//multi arrayleri cevirirken flatMap kullaniriz yapilis sekli iki turludur
//1) lambda kullanarak
// Arrays.stream(arr).flatMap(t->Arrays.stream(t))
//2) method ile
// Arrays.stream(arr).flatMap(Arrays::stream)
// BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {
        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc", "Erik"}
        };


        System.out.println("listele(arr) = " + listele(arr));
        doubleYaz(arr);

        // S3: E ile baslayan elemanlari liste olarak yazdiralim
        Arrays.stream(arr).flatMap(t->Arrays.stream(t)).filter(x->x.startsWith("E")).collect(Collectors.toList()).forEach(t-> System.out.println(t));
        System.out.println();
        //S4 : k ile bitenlerin sonuna '*' ekleyelim   ***endsWith("k")
        Arrays.stream(arr).flatMap(Arrays::stream).filter(x->x.endsWith("k")).map(t->t+"*").forEach(t-> System.out.println(t));
        System.out.println();
    }

    // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim
    private static void doubleYaz(String[][] arr) {
        Arrays.stream(arr).flatMap(t->Arrays.stream(t)).map(t-> t+t).filter(x->x.startsWith("E")).forEach(t-> System.out.println(t));
        listele(arr).stream().filter(x->x.startsWith("E")).map(t-> t+t).forEach(t-> System.out.println(t));
    }

    // S1 : tum elemanlari list yapalim
    private static List<String> listele(String[][] arr) {

        return Arrays.stream(arr).flatMap(t -> Arrays.stream(t)).collect(Collectors.toList());
        //hepsi bir streamde, bu method ile yeni bir streamde tek duzleme aliyoruz
    }



}
