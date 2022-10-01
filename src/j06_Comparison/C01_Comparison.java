package j06_Comparison;

public class C01_Comparison {
    public static void main(String[] args) {

        /*

          ==     Esit               x == y
          !=     Esit degil         x != y
          >      buyuk              x > y
          <      kucuk              x < y
          >=     buyuk esit         x >= y
          <=     kücük esit         x <= y

        */

        int slm=33;
        int krm=41;

        System.out.println("krm b esit mi slm b"+(krm==slm));//false
        System.out.println("krm b esit değil mi slm b"+(krm!=slm));//true
        System.out.println("krm b küçük mü slm b"+(krm<=slm));//false
        System.out.println("krm b büyük mü slm b"+(krm>=slm));//false

        String s1="kerem bey";
        String s2="Kerem bey";
        System.out.println(s1==s2);//true






    }
}
