package j19_StaticVariable;

import java.lang.reflect.Field;

public class Rectangle {
    /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
//Fields
    int width;
    int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public  int kare() {
        return width*length;
    }
    public  int cevre(){
        return (width+length)*2;
    }

}
