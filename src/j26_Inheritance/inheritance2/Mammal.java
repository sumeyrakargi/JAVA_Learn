package j26_Inheritance.inheritance2;

public class Mammal extends Hayvancık {//Hayvancık parent class'ın child class-baba
    public Mammal() {//p'siz cons
        this('Y');
        System.out.println("Agam ahan da Mammal p'siz cons...");
    }
    public Mammal(char c) {//p'li cons
        super(17);
        System.out.println("Agam ahan da Mammal p'li cons...");
    }
    public void mC(){
        System.out.println(" mC - > Mammal  class meth call.");
    }
    int m=1;
    int c=4;

    @Override
    public void mM() {//parentten  ezen method
        System.out.println(" mM - > Mammal  class meth call.");
    }
}// Class sonu
