package j32_Abstracts.Abstract1;

public class Civic extends Lastik {
    @Override
    public void motor() {
        System.out.println("1.6 eco motor az yakar");
    }

    @Override
    public void kapı() {

        System.out.println("5 kapı sedan");
    }

    @Override
    public void koltuk() {

        System.out.println("eco kumaş koltuk");
    }

    public  int vites(){// concrete child class method
        return 5;
    }

    @Override
    public void lastikebat() {
        System.out.println("21 inc lastik");
    }
    //Honda obj=new Civic();//Honda oğlu civic
    //Civic obj1= new Civic();
}
