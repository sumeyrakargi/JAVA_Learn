package j18_Constructor;

public class C03_StudentRunner {

    public static void main(String[] args) {
        C03_Student ogrnc1 = new C03_Student();//ogrnc1 obj create edildi.
        ogrnc1.name="Yusuf";
        ogrnc1.surname="Yanar";
        ogrnc1.sınıf=1;
        ogrnc1.okulno=1001;
        ogrnc1.ortalama=90;
        ogrnc1.takdir=true;

        System.out.println("ogrnc1 = " + ogrnc1);
        ogrnc1.mezuniyet();

        //task 2 diğer bir öğrenci obj ile tüm field ları atayıp print edniz.
        C03_Student ogrnc2 = new C03_Student();//ogrnc1 obj create edildi.
        ogrnc2.name="Ümit";
        ogrnc2.surname="Yolcu";
        ogrnc2.sınıf=1;
        ogrnc2.okulno=1000;
        ogrnc2.ortalama=100;
        ogrnc2.takdir=true;
        System.out.println("ogrnc2 = " + ogrnc2);
        ogrnc2.mezuniyet();


    }
}
