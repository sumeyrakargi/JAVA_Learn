package j08_If_Statement.iftasks;

import java.util.Scanner;

public class Yusuf {
    public static void main(String[] args) {





        Scanner input = new Scanner(System.in);


            int bakiye, k;

            bakiye = 300;
            int işlem;
            int başarılıişlem;

            başarılıişlem = 0;
            k = 1;
            for (k = 1; k <= 50; k++) {
                System.out.println(Integer.toString(k) + ".işlem başarılı ise 1  başarısız ise 2 yazınız ");
                işlem = input.nextInt();
                if (işlem == 1) {
                    bakiye = (int) (bakiye * 1.25);
                    başarılıişlem = başarılıişlem + 1;
                    System.out.println(Integer.toString(k) + " işlem başarılı:" + başarılıişlem + "güncel bakiye:  " + bakiye);
                } else {
                    System.out.println("daha iyi olmaya çalış sakin kal");
                }
            }
            System.out.println("program sonunda toplam işlem sayısı: " + k + "başarılı işlemsaysı: " + başarılıişlem + "bakiye" + bakiye);
        }
    }


