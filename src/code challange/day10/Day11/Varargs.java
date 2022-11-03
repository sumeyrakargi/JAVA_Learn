package Day11;public class Varargs {

    public static void main(String[] args) {
        sumAll(5,9,2,5,7,9,89,94);
    }

    private static void sumAll(int...sayi) {
        int toplam=0;

        for (int a :sayi) {
            toplam += a;
        }
        System.out.println("toplam"+toplam);


    }

}
