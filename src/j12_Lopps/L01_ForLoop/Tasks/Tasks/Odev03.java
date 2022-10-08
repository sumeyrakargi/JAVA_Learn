package j12_Lopps.L01_ForLoop.Tasks.Tasks;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("bir pozitif tam sayı giriniz : ");
        int sayi = sc.nextInt();
        System.out.println(getASalmı(sayi));
    }
    private static boolean getASalmı(int sayi) {

        boolean asalmı=true;
        for (int i=2;i<sayi;i++){
            if (sayi%i==0){
                asalmı=false;
            }
        }return asalmı;
    }
}
