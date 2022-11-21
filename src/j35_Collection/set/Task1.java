package j35_Collection.set;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        //Değer ataması yapılan Arrayi Arraylist e çeviren method create ediniz.
        // main içerisinde methodun return ettiği arraylisti hasSeti LinkedHasSet ve TreeSet e atayınız

        String [] arr={"Sumeyra","Ismail","Adem","Murat","Busra"};

        listcevir(arr);
        HashSet <String>hs= new HashSet<>(listcevir(arr));
        LinkedHashSet <String>ls = new LinkedHashSet<>(listcevir(arr));
        TreeSet <String> ts = new TreeSet<>(listcevir(arr));

        System.out.println("hs = " + hs);//hs = [Adem, Sumeyra, Busra, Ismail, Murat]--> karışık
        System.out.println("ls = " + ls);//ls = [Sumeyra, Ismail, Adem, Murat, Busra]-->nasıl yazdıysak
        System.out.println("ts = " + ts);//ts = [Adem, Busra, Ismail, Murat, Sumeyra]-->alfabetik

    }

    private static ArrayList listcevir(String[] arr) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        return (ArrayList) list;

    }
}
