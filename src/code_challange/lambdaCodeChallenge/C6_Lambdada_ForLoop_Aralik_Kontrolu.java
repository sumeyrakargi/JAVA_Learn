package code_challange.lambdaCodeChallenge;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class C6_Lambdada_ForLoop_Aralik_Kontrolu {

    public static void main(String[] args) {
        //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yazdiralim
        IntStream.iterate(21, t->t+7).limit(10).forEach(Methods::yazInteger);
        System.out.println();

    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //range(int startInclusive, int endExclusive)
        IntStream.range(1, 30).forEach(t-> System.out.print(t + " "));
        System.out.println();


        //S2:  1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //rangeClosed(int startInclusive, int endInclusive)
        IntStream.rangeClosed(1,30).forEach(t -> System.out.print(t + " "));
        System.out.println();

    //S3 Istenen iki deger(dahil) arasindaki sayilari toplayalim **rangeClosed(a,b)
        System.out.println(IntStream.rangeClosed(5, 12).sum());


    //S4: 30 ile 40 arasindaki sayilarin (dahil) ortalamasini bulalim **average()
        System.out.println(IntStream.rangeClosed(30, 40).average());



    //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?  **rangeClosed(a,b)   filter()  count()- long
        System.out.println(IntStream.rangeClosed(325, 468).filter(t -> t % 8 == 0).count());

    //S6: 325 ile 468 arasinda 8 e bolunen sayilari yazdiralim **rangeClosed(a,b)   filter()  forEach()
        IntStream.rangeClosed(325, 468).filter(t ->t%8==0).forEach(t -> System.out.print(t+ " "));
        System.out.println();

    // S7:325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim  **rangeClosed(a,b)   filter() sum()
        System.out.println(IntStream.rangeClosed(325, 468).filter(t -> t % 8 == 0).sum());

    // S8: 7 ile 15 (dahil) arasindaki tek sayilarin carpimini bulalim **rangeClosed(a,b)   Methods::tekMi   reduce(1, carpim)
        System.out.println(IntStream.rangeClosed(7, 15).filter(Methods::tekMi).reduce(1, (t, u) -> t * u));

    //S9: pozitif tek sayilarin ilk 10 elemanin yazdiralim  *** IntSteram    limit(10)  filter ()  forEach()
        IntStream.iterate(1,t->t+2).limit(10).forEach(t-> System.out.print(t+ " "));
        System.out.println();


    //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yazdiralim
    IntStream.iterate(21,t->t+7).filter(Methods::tekMi).limit(10).forEach(t -> System.out.print(t + " "));
        System.out.println();

    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim
        System.out.println(IntStream.iterate(21, t -> t + 7).limit(20).sum());


    }}
//iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
//iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide
// limit() ile belirliyoruz