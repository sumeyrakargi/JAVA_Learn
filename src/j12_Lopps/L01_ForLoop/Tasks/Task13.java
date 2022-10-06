package j12_Lopps.L01_ForLoop.Tasks;

public class Task13 {
    public static void main(String[] args) {

        int harf=65;
        for (int i=0;i<6;i++){
            for (int j=0;j<=i;j++){

                System.out.print((char) (harf+i)+" ");

            }
            System.out.println();


        }

    }


}
