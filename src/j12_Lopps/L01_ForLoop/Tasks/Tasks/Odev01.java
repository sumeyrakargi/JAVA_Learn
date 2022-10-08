package j12_Lopps.L01_ForLoop.Tasks.Tasks;

public class Odev01 {

    public static void main(String[] args) {

        //    0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
        //Not: 0 ve 100 dahildir.

      for (int i=0; i<=100;i++){
          System.out.println(i%2==0? i:"");
      }
    }
}
