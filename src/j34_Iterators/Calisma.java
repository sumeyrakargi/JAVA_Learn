package j34_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Calisma {

    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        list.add("Sumeyra");
        list.add("Umut");
        list.add("Hayat");
        list.add("Londra");
        list.add("Qa tester");
        Iterator<String> It=list.iterator();
        System.out.println(It.hasNext());//true
        System.out.println(It.next());//Sumeyra
        System.out.println(It.next());//Umut
        System.out.println(It.next());//Hayat
        System.out.println(It.next());//Londra
        System.out.println(It.next());//Qa tester
        System.out.println(It.hasNext());//false;


    }
}
