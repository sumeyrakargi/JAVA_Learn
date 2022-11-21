package j35_Collection.LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object>list=new LinkedList<>();//DataTypeObject
        //Bad practice app. çok yavaşlar tavsiye edilmez.
        list.add("Umit");
        list.add('C');
        list.add(33);
        System.out.println("list = " + list);//list = [Umit, C, 33]
    }
}
