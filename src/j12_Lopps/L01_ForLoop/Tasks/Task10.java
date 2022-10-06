package j12_Lopps.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // Girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        Scanner sc=new  Scanner(System.in);

        System.out.println("Bir cümle giriniz : ");
        String cümle=sc.nextLine();
        System.out.println("harf giriniz ");
        char harf=sc.next().charAt(0);

        int harfs=0;// ilk değer 0 atandı ki  saymaya etki etmesin

        for (int i=0;i<=cümle.length()-1;i++){
            if (cümle.charAt(i)==harf){
                harfs++;
            }

        }
        System.out.println("girdiğiniz cümle :"+cümle+" de istediğiniz harf :"+harf+"--> "+harfs+" adet var");

        }

}
