package j05_AssşgnmentOperator;

public class C01_AtamaOperatoru {
    public static void main(String[] args) {

        //    =         x = 8      x = 8
        //    +=       x += 3     x = x + 3
        //    -=       x -= 3     x = x - 3
        //    *=       x *= 3     x = x * 3
        //    /=       x /= 3     x = x / 3
        //    %=       x %= 3     x = x % 3


        int yas=33;
        System.out.println(yas+5);//38 atama (=) olmadığı için yas hala 33
        System.out.println("yas="+yas);//33
        System.out.println(yas+=11);//44 atama yapıldığı için artık yaş 44

        System.out.println(yas == 44);//true
    }}
