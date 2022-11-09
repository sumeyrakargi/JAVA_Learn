package j29_Exeptionn;

public class C03_ClassCastException {

    public static void main(String[] args) {

        //ClassCastException--> Birbirine dönüştürülemeyen data type lar birbirine dönüştürüldüğünde oluşan RTE Exception dur.

        Object obj="javacanlara selam";
        String str=(String) obj;// object data type String data type casting yapılarak atandı
        System.out.println("str = " + str);

        Object sayi1=10;
        //String str2=(String) sayi1;// object data type String data type casting yapılarak atandı
        //System.out.println("str2 = " + str2);//ClassCastException

        try {
            String str2=(String) sayi1;
        }catch (ClassCastException e){
            System.out.println("integer stringe çevrilir mi");
        }
        try {
            String str3=(String) obj;
            System.out.println(" bu yazıyı okuyorsan excep fırlatmadı komut sorunsuz");
        }catch (ClassCastException e){
            System.out.println("integer stringe çevrilir mi");
        }
        System.out.println("devam");//bu kod çalışmışsa program kırılmadan run olmştur.
    }
}
