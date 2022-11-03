package j25_Encapsulation.j25_Encapsulation03;

public class Arac {
    /*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
  olan Araba  isimli bir class cretae ediniz.
    2- bütün fieldları parametre alan bir constructor tanımlayınız.
    3- ArabaMain isminde main için bir class oluşturunuz.
    4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
    5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
     */

    //fields--2.step
    private String model;
    private String renk;
    private int motor;
    private int yıl;


    public Arac(String model, String renk, int motor, int yıl) {// 2. step full parametreli telescopic cons.
        this.model = model;
        this.renk = renk;
        //this.motor = motor;
        setMotor(motor);//set meth call edildi.
        //this.yıl = yıl;
        setYıl(yıl);
    }
    public Arac(){//4.step

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if( motor<1000){
        this.motor = 1001;
        }
    }
    public int getYıl() {
        return yıl;
    }
    public void setYıl(int yıl) {
        if (yıl<0){
        this.yıl =(-1)* yıl;}else this.yıl = yıl;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yıl=" + yıl ;
    }
}
