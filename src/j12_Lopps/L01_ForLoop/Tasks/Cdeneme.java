package j12_Lopps.L01_ForLoop.Tasks;

public class Cdeneme {
    public static void main(String[] args) {

        //    *
        //   ***
        //  *****
        // *******
        //*********
        int  i,k;
        for (i = 0; i <6; i++) {

            for (int j = i; j <6; j++)
                System.out.print(" ");

                for (k = 1; k < i+1; k++)
                    System.out.print("*");
                    System.out.println();
        }

        }}
/*
 for (int satir = 1; satir <=5 ; satir++) {
            for (int sutun = 1; sutun <=satir ; sutun++) {
                System.out.print("*");
            }
            System.out.println();

 */

