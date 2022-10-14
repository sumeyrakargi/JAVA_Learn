package j15_Arrays.ArraysEasyTasks.odev;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        int arr[] = {5,6,8,12,14,19};
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==1) {
                toplam -= arr[i];
            }else toplam+=arr[i];
        }System.out.println(toplam);//16
    }
}
