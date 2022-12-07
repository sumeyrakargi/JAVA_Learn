package code_challange.lambdaCodeChallenge;

// lambda da method kullanimi :
//ilk olarak class adi yazilir
//sonra  :: noktalar konur
//son olarak method secilir
//String class i sayesinde length gibi touppercase gibi methodlari kullanabiliriz
//Math classi sayesinde de sum vb methodlar kullanabiliriz

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C4_Method_Refarance_Int {
    public static void main(String[] args) {
        List<Integer> intL= Arrays.asList(-2,-8,-5,0,2,5,6,7,15,6,8);

        System.out.println("negatifKareToplam(intL) = " + negatifKareToplam(intL));
        System.out.println("pozitifKupMax(intL) = " + pozitifKupMax(intL));

    }


    // S3: negatiflerin kare toplamlarini  bulalim
    private static Optional<Integer> negatifKareToplam(List<Integer> intL) {

        return intL.stream().filter(Methods::negatifMi).map(Methods::kareBul).reduce(Methods::toplam);

    }
    // S1: tekleri aralarinda bir bosluk birakarak yazdiralim


    // S2: ciftlerin carpimini bulalim


    // S3: negatiflerin kare toplamlarini  bulalim


    // S4: poziflerin kuplerinden max olani yazdiralim
    private static Optional<Integer> pozitifKupMax(List<Integer> intL) {

        return intL.stream().filter(Methods::pozitifMi).map(Methods::kupBul).reduce(Math::max);
        //return intL.stream().filter(Methods::pozitifMi).map(Methods::kupBul).reduce(Integer::max);
    }



}
