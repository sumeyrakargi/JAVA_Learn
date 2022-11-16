package j32_Abstracts.Abstract1;

public abstract class Honda {//parent abstract class

    public abstract void motor();

    void sunroof(){
         System.out.println("sunroof extra maaliyet");
     }

     //abs parent class ta variable tanımlanabilir mi?

    String name="Sümeyra QA tester";

    // variable lar abstract tanımlanır mı?--> kesinlikle hayır.
    //public abstract int yaş=48;

     abstract void kapı();

    abstract void koltuk();

    //final void finalMethod();// concrete method body siz olamaz.
    //final abstract void finalMethod();-->abs method final olamaz

    //private void privateMethod();//concrete method body siz olamaz.
    //private abstract  void gunes();// abs method private olamaz



}
