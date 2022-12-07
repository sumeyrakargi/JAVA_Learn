package aCalısma;

public class C02 {
    int a=10;
    public class inner {
        int a =9;
        public void run() {
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(C02.this.a);
        }

    }
public void run() {
    System.out.println(a);
    System.out.println(this.a);
    inner i= new inner();
    System.out.println(i.a);

}

}

