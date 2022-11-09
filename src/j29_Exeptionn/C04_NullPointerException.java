package j29_Exeptionn;

public class C04_NullPointerException {
    public static void main(String[] args) {

        //NullPointerException--> null ataması yapılan bir String de length() method ryn edildiğinde oluşam RTE exception
        String str="";
        System.out.println("str.length() = " + str.length());


         String str1=null;
        try {
            System.out.println("str1.length() = " + str1.length());// excp. try block kırılır catch block  çalışır.
            System.out.println("try dan selam");
        }catch (NullPointerException e){
            System.out.println("hata");

            try {
                System.out.println("str.length() = " + str.length());// excp.olmadığı için try block çalışır catch block  çalışmaz
                System.out.println("try dan selam");
            }catch (NullPointerException f){
                System.out.println("hata");

        }System.out.println("devam");


    }
}}
