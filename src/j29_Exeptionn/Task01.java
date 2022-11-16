package j29_Exeptionn;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        task--> Girilen password un 6 karakterden az 10 karakterden fazla olmasını kontrol eden code create ediniz
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("password giriniz");
        String password=sc.next();

        try {
            if (password.length()<6){
                throw new IllegalArgumentException("password 6 karakterden büyük olmalıdır");
            }else if(password.length()>10){
                throw new IllegalArgumentException("password 10 karakterden büyük olamaz");
            }else System.out.println("password geçerli :" + password);

        }catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println("olmadı");
        }
        System.out.println("devam");
    }
}
