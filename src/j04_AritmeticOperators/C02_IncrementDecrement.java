package j04_AritmeticOperators;

public class C02_IncrementDecrement {
    public static void main(String[] args) {


        System.out.println("   **** Increment->Artırma ****   ");
        int a=7;
        System.out.println(++a);//8
        System.out.println(a++);//8
        System.out.println(a);//9
        System.out.println(a++ + ++a);//20

       // System.out.println(++a);//önce arttırır sonra yazdırır 8
       // System.out.println(a++);//önce yazdırır sonra arttırır 8
       // System.out.println(a);// değeri bir önceki satırda arttığı için 9 (artmıştı ama yazmamıştı önceki satırda)
       // System.out.println(a++ + ++a);// önce yazdırır (9) sonra arttırır değeri 10 olur + önce arttırır (11) sonra yazdırır(11)=9+11=20

        int k = 5;

        int sonuc = ++k + k++ + k++ + --k + k-- + k;
        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);
        


    }
}