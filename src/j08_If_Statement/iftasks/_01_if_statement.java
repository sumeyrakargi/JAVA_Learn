package j08_If_Statement.iftasks;

public class _01_if_statement {

    public static void main(String[] args) {

    /*  İki tane int oluşturun. Birinci (1.) int 35. İkinci (2.) int 23.
        Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
        Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın.  */

        //Kodu aşağıya yazınız.

        int int1=35;
        int int2=23;

        if (int1>int2) System.out.println("int 1 is greater than 2");
        else System.out.println("int 1 is smaller than 2");

        System.out.println(int1>int2?"int 1 is greater than 2":"int 1 is smaller than 2");




    }
}
