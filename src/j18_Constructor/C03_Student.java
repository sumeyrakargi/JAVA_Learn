package j18_Constructor;

public class C03_Student {
    //Fields
    String name;
    String surname;
    int sınıf;
    int okulno;
    int ortalama;
    boolean takdir;

    @Override
    public String toString() {//objenin referans değeri print etmemesi için
        return "C03_Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sınıf=" + sınıf +
                ", okulno=" + okulno +
                ", ortalama=" + ortalama +
                ", takdir=" + takdir +
                '}';
    }

    public void mezuniyet() {//method
    if (ortalama>=50){
        System.out.println("Tebrikler,mezun oldunuz.");
    }else System.out.println("olmadı");

    }}
