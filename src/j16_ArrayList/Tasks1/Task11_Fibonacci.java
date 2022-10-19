package j16_ArrayList.Tasks1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task11_Fibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Bir tamsayı  giriniz :");
         int sayı= sc.nextInt();
         // F(n) = F(n - 1) + F(n - 2)
         ArrayList<Integer>fibonacci = new ArrayList<>(Arrays.asList(1,1));
         int i = 2;
         while ((fibonacci.get(i - 1) + fibonacci.get(i - 2)) <= sayı) {
             fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
             i++;
         }
         System.out.println("fibonacci = " + fibonacci);

     }}



