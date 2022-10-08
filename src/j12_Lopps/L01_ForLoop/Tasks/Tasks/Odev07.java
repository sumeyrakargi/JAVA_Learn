package j12_Lopps.L01_ForLoop.Tasks.Tasks;

public class Odev07 {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15


        int satır=5;
        for (int i = 1; i <= 5; i++) {

            int a=i;
            int artış=satır-1;
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a+=artış;
                artış--;
            }
            System.out.println();
            }}}



