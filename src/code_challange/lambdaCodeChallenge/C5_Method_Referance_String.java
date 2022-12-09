package code_challange.lambdaCodeChallenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C5_Method_Referance_String {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");


    // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim
        l.stream().map(String::toUpperCase).forEach(t-> System.out.print(t + " "));
        System.out.println();

    // S2: Stringleri uzunluklarina gore siralayip yaziniz
        l.stream().sorted(Comparator.comparing(String::length)).forEach(t -> System.out.print(t + " "));

        System.out.println();

    // S3: E ILE Baslayanlari yazdiralim
        l.stream().filter(t->t.startsWith("E")).forEach(t -> System.out.println(t+" "));



}}
