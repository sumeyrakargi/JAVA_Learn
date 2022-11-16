package j32_Abstracts.Abstract1;

public class Accord extends Honda {
    @Override
    public void motor() {
        System.out.println("2.0 motor ,hıza dikkat");
    }

    @Override
    public void kapı() {
        System.out.println("vakumlu kapı");
    }

    @Override
    void sunroof() {
        System.out.println("sunroof lazım");
    }

    @Override
    public void koltuk() {
        System.out.println("deri koltuk");

    }
}
