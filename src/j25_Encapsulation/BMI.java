package j25_Encapsulation;

public class BMI {
    /*
 Bmı classfields -> name, age, weight,height: encapsulated
getBMI() method -> bmi=weight/(height*height) returb type olmalı
 getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
 runner class obj ile dataları print eden code create ediniz
  */

private String name;
private  int age;
private double weight;
private double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public  String getStatus() {
        if (getBMI() < 18.5) {
            return "zayif";
        } else if (getBMI() < 25) {
            return "normal";
        } else if (getBMI() < 30) {
            return "kilolu";
        } else return "obez";

    }
    public  double getBMI() {
        double bmi=weight/(height*height);
        return bmi;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }


}class Runner{//inner class

      public static void main(String[] args) {//main bası
          BMI obj = new BMI("Muharrem bey", 46, 54, 1.63);
          System.out.println("BMI :"+ obj.getName()+" "+obj.getStatus()+" "+obj.getBMI());





      }//main sonu




  }






