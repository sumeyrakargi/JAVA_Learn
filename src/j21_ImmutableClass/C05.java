package j21_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C05 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        //list.add(7);  CTE verir

        for (String s : list) System.out.println(s);


        // TASK
        String a = "";
        a += 2;//a="2"
        a += 'c';//a="2c"
        a += false;//a="2cfalse"


        if (a == "2cfalse") {//şart sağlanmaz.--> a referansı "2cfalse" atama olmadığı için referans yok
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }

        //TASk
        ArrayList<Integer> values = new ArrayList<>();
        System.out.println("method öncesi values = " + values);//[]
        values.add(4);
        values.add(5);
        values.set(1, 6);
        values.remove(0);

        for(Integer v : values) System.out.println(v);
        System.out.println("method sonrası values = " + values);//[6] -> arrayList mutable bir class'dır.






    }
    }

