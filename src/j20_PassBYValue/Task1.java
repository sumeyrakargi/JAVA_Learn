package j20_PassBYValue;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String data type ArrayList'leri depolayabilen 2D ArrayList create ediniz
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 ArrayListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */
    public static void main(String[] args) {
        ArrayList<String>calısanlar= new ArrayList<>(List.of("Kubra","Ahmet","Merve","Ihsan"));
        ArrayList<String>isverenler= new ArrayList<>(List.of("isveren1","Isveren2","Isveren3"));
        ArrayList<String>sirketler= new ArrayList<>(List.of("Sirket1","Sirket2","Sirket3"));
        ArrayList<ArrayList<String>> son= new ArrayList<>(List.of());
        son.add(sirketler);
        son.add(calısanlar);
        son.add(isverenler);
        System.out.println(son);


    }
}
