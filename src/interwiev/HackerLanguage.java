package interwiev;

import java.util.*;

public class HackerLanguage {

    // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz ");
        String str=sc.nextLine();


        hackerDili(str);
    }

    private static void hackerDili(String str) {
        str=str.replaceAll("s","5").replaceAll("a","4").
                replaceAll("e","3").replaceAll("i","1").replaceAll("o","0");

        System.out.println(str);

        //2.yol

        List list = new ArrayList<>(Arrays.asList(str.toLowerCase().split("")));
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()) {
            switch (it.next()) {
                case "s": it.set("5");break;
                case "e": it.set("3");break;
                case "i": it.set("1");break;
                case "a": it.set("4");break;
                case "o": it.set("0");break;
            }
        }
        list.forEach(x->System.out.print(x+""));

        //3.yol
        String [] arr= new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] =str.substring(i,i+1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int j =0;j<str.length();j++) {
            if(arr[j].contains("s")){ arr[j] = "5";}
            if(arr[j].contains("a")){ arr[j] = "4";}
            if(arr[j].contains("e")){ arr[j] = "3";}
            if(arr[j].contains("i")){ arr[j] = "1";}
            if(arr[j].contains("o")){ arr[j] = "0";}
            System.out.print(arr[j]);
        }
    }

    }

