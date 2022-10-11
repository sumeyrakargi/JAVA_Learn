package j11_Method_Creation;

public class C04_MethodDepo {

    // main method olmayacak
    /* her class ta main method mecburiyeti yoktur.*/

    public static void geçmenotu(int not){
        if (not>=85){
            System.out.println("agam tebrik çoook başarılı :)");
        } else if (not>=70) {
            System.out.println("başarılısın");

        } else if (not>=60) {
            System.out.println("agam geçtin");

        } else if (not>=45) {
            System.out.println("agam ucuz yırttın");

        }else System.out.println("agam çaktın :(");

    }
    public static void topla(double sayi1, double sayi2) {

        System.out.println("double-double type method çalıştı -> " + (sayi1 + sayi2));


    }
}
