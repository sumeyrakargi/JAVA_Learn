package j18_Constructor;

public class C01_Constructor {
    /*
    1-consturctor ismi Class bame ile aynı olmalı.Büyük harf ile başlamalı
    2-constructor create edildiğinde name den sonra (){}mutlaka konulmalıdilir
    3.eğer p'li cons. create edildiğinde java default cons ezer(siler)
    4- cons.return type olmaz method dan ayıran özelliğidir
    5- Class oluştuğunda java default cos. kendi create eder.
     */

    String str; //instance variable--> obj variable
    String selam="güzel insan";

    public static void main(String[] args) {
        //class name     obje name    new kwyword     default cons.
        C01_Constructor  obj          =new            C01_Constructor();
        C01_Constructor  obj2         =new            C01_Constructor();
        C01_Constructor  obj3         =new            C01_Constructor();

        obj.str="javacan";//str in. variable obj ile call edilerek obj javacan değer, atandı
        obj2.str="javatar";//str in. variable obj2 ile call edilerek obj2 javatar değer, atandı
        System.out.println(obj.selam);//"güzel insan"

        System.out.println("obj.str = " + obj.str);//javacan
        System.out.println("obj2.str = " + obj2.str);//javatar
        System.out.println("obj3.str = " + obj3.str);//null

        obj.aga();
    }
    public static void aga(){
        System.out.println( "agama selamkee");
    }
}
