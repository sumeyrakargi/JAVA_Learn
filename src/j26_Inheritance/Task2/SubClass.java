package j26_Inheritance.Task2;

public class SubClass extends SuperClass{

    int num= 10;

    public void goster(){
        System.out.println("Bu method Sub classsın görüntülenme methodudur. ");
    }

    public void myMethod(){
        goster();
        super.goster();
        System.out.println("Sub classtaki eleman :"+num+"\nsüperClasstaki eleman "+super.num);

    }
    public static void main(String[] args) {
        SubClass s1= new SubClass();
        s1.myMethod();

    }
}
