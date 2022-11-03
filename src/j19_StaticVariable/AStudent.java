package j19_StaticVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AStudent {
   // Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
    //derslerin toplam kredi miktarını return eden  toplamKredisi method

    //Fields

    String name;
    static int maxCredit=10;
   List<ALesson>dersler = new ArrayList<>();


    public AStudent(String name) {
        this.name = name;

    }

    public int toplamKredisi() {

        int toplamcredit = 0;
       while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Lütfen almak istediğiniz dersi giriniz");
            String lesson = sc.nextLine().toUpperCase();
            System.out.println("Lütfen almak istediğiniz dersin kredisini giriniz");
            int kredi = sc.nextInt();
            ALesson lesson1= new ALesson(lesson,kredi);
            dersler.add(lesson1);
            toplamcredit+=kredi;
            if(toplamcredit>=10){
                System.out.println("Kredi limitini aştınız "+lesson+" dersini alamazsınız.");

                break;
            }
        } return toplamcredit;
    }}

