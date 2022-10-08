package j12_Lopps.L03_DoWhile;

public class C01_DoWhile {
    public static void main(String[] args) {
        /*
        While loop --> önce şart kontrol edilir,eğer true alınırsa body action çalışır.
        Do While loop--> Önce body action çalışır sonra şart kontrol edilir.şart true ise döngü devam eder.
        art false ise döngü kırılır ve döngüden sonraki ilk satırdan devam eder.
        do While daha çok game app. de kullanılır.

        Trick : While loop şart sağlanmazsa hiç çalışmayabilir fakat do While şart sağlasın sağlamasın
        en az bir kere çaışır.
         */
        int yas=33;
        while (yas<33){
            System.out.println("yaş "+yas );
            System.out.println("while body action....");
         yas++;
        }
        do{
            System.out.println("yaş"+ yas);
            System.out.println("do while body action");
            yas++;
        }while (yas<33);

    }
}
