package j09_Switch_Statement.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();

        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
                break;
        }





    }
}
