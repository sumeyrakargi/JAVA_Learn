package j26_Inheritance.inheritance2;

import j26_Inheritance.inheritance1.Koyun;
import j26_Inheritance.inheritance1.Paluk;

public class Runner {

    public static void main(String[] args) {
        Kedi k1 = new Kedi();
        System.out.println(k1.a);//0--> Hayvancık class called
        System.out.println(k1.c);//2--> Kedi class called
        System.out.println(k1.d);//5-->Kedi class called
        System.out.println(k1.m);//1-->Mammal class called
        /*
          Ayni isimli variable'lardan hangisinin kullanildi
        olusturulan object'in data type'ina göre bilinir
        Variable'i arastirmaya data type'i classindan baslanır.
        */

        k1.mA();//parent class called
        k1.mC();//Kedi class called
        k1.mM();//Mammal class called

        /*
        Method cagirilirken ayni isimli methodlardan
        hangisinin kullanilacagina Constructor karar verir.
        Methodlari arastirmaya Consctuctor ismini tasiyan
        class'dan baslayin ve parentlarda arastirmaya devam edin.
        */
        Mammal k2=new Kedi("Kevser");
        System.out.println(k2.c);
        System.out.println(k2.a);
        System.out.println(k2.m);
        // k2.d--> CTE verir,k2 obj data type Mammal class d variable call edilemez.

        k2.mA();
        k2.mC();
        k2.mM();

        Hayvancık k3= new Kedi();
        System.out.println(k3.m);
        //k3.c--> Data type Hayvancık class olduğu için class da olmayan c call edilmez.
        System.out.println(k3.a);
        k3.mA();
        k3.mM();

        Mammal m1 = new Mammal('x');
        System.out.println(m1.m);//1
        System.out.println(m1.a);//0
        System.out.println(m1.c);//4
        //m1.d-->parent Mammal class child Kedi class dan variable call edemez.
        m1.mM();//Mammal Class called
        m1.mC();//Mammal Class called
        m1.mA();//Hayvancık Class called

    }
}
