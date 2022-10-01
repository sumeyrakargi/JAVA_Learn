package j08_If_Statement;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

       /* TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
        kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
        kontrol edip kalan yıl ve prim gununu print eden code create ediniz*/

        Scanner sc = new Scanner(System.in);

        System.out.print("cinsiyetiniz \n KADIN için-> K\n ERKEK için-> E\n giriniz : ");

        char cnsyt = sc.next().charAt(0);

        System.out.println("yasınızı giriniz : ");
        int yas = sc.nextInt();



        if (cnsyt=='K'){
            if (yas>60) {
                System.out.println("prim gününü giriniz : ");
                int prim = sc.nextInt();
                if (prim>6000){
                    System.out.println("Tebrikler emekli oldunuz");
                } else System.out.println("Emekliliğiniz için: "+(6000-prim)+" daha yatırmanız lazım");
            }else System.out.println("Emekliliğinize daha : "+(60-yas)+" yıl daha var");

        }else if (cnsyt=='E')
            if (yas>65) {
                System.out.println("prim gününü giriniz : ");
                int prim = sc.nextInt();
                if (prim>7000){
                    System.out.println("Tebrikler emekli oldunuz");
                } else System.out.println("Emekliliğiniz için: "+(7000-prim)+" daha yatırmanız lazım");
            }else System.out.println("Emekliliğinize daha : "+(65-yas)+" yıl daha var");






    }
}
