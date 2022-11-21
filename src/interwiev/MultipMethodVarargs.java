package interwiev;

public class MultipMethodVarargs {
     /*
farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
yazdıran parametreli method yazınız
*/

    public static void main(String[] args) {

        ortalamabul("Sumeyra",97,100,98,100);
        ortalamabul("UMit",60,72,56,100,50,17);
        ortalamabul("Umut",80,90,75,95);
        ortalamabul("Yusuf",10,15,50,82,11,32);

    }

    private static void ortalamabul(String name,double...notes) {
      double sum = 0;
        for (double each:notes
             ) sum+=each;
        {

        }
        System.out.println(name + "-> not ortalamasi : " + sum/notes.length);
    }
}
