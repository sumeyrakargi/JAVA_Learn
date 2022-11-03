package j25_Encapsulation.j25_Encapsulation02;

public class Runner {
    public static void main(String[] args) {
        C01_Kisi obj1= new C01_Kisi("Sumeyra", "Yolcu",36,"123467827634");


        obj1.setName("Qa Sumeyra Yolcu");
        System.out.println("obj1.name = " + obj1.name);//
        System.out.println("obj1.getName() = " + obj1.getName());//
        System.out.println("obj1.getPassword() = " + obj1.getPassword());//
        obj1.setYas(-37);
        System.out.println("obj1.getYas() = " + obj1.getYas());//

    }
}
