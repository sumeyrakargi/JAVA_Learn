package j10_String_Manipulation;

public class C01_Concatenation {
    public static void main(String[] args) {


        /*
        concat() methodu içine( parametre aldığı string variable'ı çalıştığı stringin sonuna ekler.
        javada + işlemiyapılırken eğer az bir string variable varsa java toplama değil concot yapar.
         */

        String name="Nur ";

        String meslek=" Qa tester";
        System.out.println(name.concat(meslek));//NUr Qa TEster
        System.out.println(name);//NUr

       // TRICK-> String methodları variable geçici değişiklik yapar.
        // ama değişken atama yapılırsa kalıcı değişir.

        name=meslek.concat(name);
        System.out.println("name ="+ name);// Qa tester Nur
        System.out.println("name = " + name);//name =  Qa tester  Nur

        System.out.println( name.concat(true + " :) "));// Qa tester  Nurtrue :)
        System.out.println( name.concat(100+ " :) "));// Qa tester  Nur 100 :)

        // TRICK-> concat methodu parametre olarak string type harici tüm dataları srtinge cevirip concat eder




    }


}
