package j33_interface.Tasksekil;

public class Runner {
    public static void main(String[] args) {
        Cember c= new Cember();
        System.out.println("c.alan(4) = " + c.alan(4));
        System.out.println("c.cevre(4) = " + c.cevre(4));

        Dikdörtgen d=new Dikdörtgen();
        System.out.println("d.alan(4,5) = " + d.alan(4, 5));
        System.out.println("d.cevre(4,5) = " + d.cevre(4, 5));

        Kare k= new Kare();
        System.out.println("k.alan(5) = " + k.alan(5));
        System.out.println("k.cevre(6) = " + k.cevre(6));
    }
}
