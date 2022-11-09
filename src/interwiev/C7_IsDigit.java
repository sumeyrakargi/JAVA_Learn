package interwiev;

public class C7_IsDigit {
    /*
 Create a method that accepts a String as parameter and finds the sum of digits in that String.
 Example:
 input : J4\/4 1$ 34$¥
 output : 16

 Hint:
 Character.isDigit()
 Integer.valueOf()
*/

    public static void main(String[] args) {

        String str = "J4\\/4 1$ 34$¥" ;

        sumOfDigit(str);
    }
    private static void sumOfDigit(String str) {
        int sum =0;
        for (int i = 0; i <str.length() ; i++) {

            if (Character.isDigit(str.charAt(i))) {
                sum+=Integer.parseInt(String.valueOf(str.charAt(i)));// önce char at i Stringe çevirdi. daha sonra parse int ile integer a çevirdi.
            }
        }System.out.println("sum = " + sum);
    }}
