package Task;

import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int sayi = sc.nextInt();

        for (int i = String.valueOf(sayi).length()-1; i >=0 ; i--) {
            System.out.print(String.valueOf(sayi).charAt(i));
        }
    }}
