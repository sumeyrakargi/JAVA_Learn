package j29_Exeptionn;

public class C05_ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {

        //ArrayIndexOutOfBoundsException--> arraylerde olmayan bir index elemanı ile işlem yapıldığında oluşan RTE exception.
        int arr[]={24,27,38,41,54};

        System.out.println("arr[0] = " + arr[0]);

        try {
            System.out.println("arr[7] = " + arr[7]);
            System.out.println("try dan selam");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("hata");
        }
        try {
            System.out.println("arr[2] = " + arr[2]);
            System.out.println("try dan selam");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("hata");
        }System.out.println("devamm");
    }
}
