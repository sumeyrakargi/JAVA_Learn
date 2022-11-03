package j25_Encapsulation.j25_Encapsulation03;

public class Runner {//3.step

    public static void main(String[] args) {
        Arac volvo= new Arac("s80","beyaz",2000,2013);
        Arac honda= new Arac("accord","siyah",-200,2015);
        Arac hacıMurat=new Arac();
        hacıMurat.setModel("serce");
        hacıMurat.setRenk("turuncu");
        hacıMurat.setMotor(1300);
        hacıMurat.setYıl(1974);
        System.out.println("volvo.getModel() = " + volvo.getModel());
        System.out.println("honda ne ararsan var ona"+honda);//honda ne ararsan var onaArac{model='accord', renk='siyah',motor=1001, yıl=2015
        System.out.println("hacıMurat = " + hacıMurat);//hacıMurat = Arac{model='serce', renk='turuncu', motor=0, yıl=1974
        System.out.println("volvo = " + volvo);//volvo = Arac{model='s80', renk='beyaz', motor=0, yıl=2013
    }

}
