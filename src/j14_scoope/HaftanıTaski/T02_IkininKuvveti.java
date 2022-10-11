package j14_scoope.HaftanıTaski;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir tamsayı  giriniz :");
        int num=sc.nextInt();
        PowersofTwo(num);
    }
    private static void PowersofTwo(int num) {
            boolean ikininkuvvetimi=true;
           while (num/2==0){
               num/=2;
                if (num!=0){
                    ikininkuvvetimi=false;
                    break;
                }}
            if (ikininkuvvetimi){
                System.out.println("girilen sayı 2'nin kuvvetidir ");
            }else System.out.println("girlen sayı 2'nin kuvveti değildir ");}}
/*
Scanner input= new Scanner(System.in);
        System.out.print("Please enter a positive integer number : ");
        double num=input.nextDouble();
        System.out.println(PowersofTwo(num));
    }

    public static boolean PowersofTwo(double num) {
        while(num>2){
            num/=2;
        }
        return num%2==0||num==1;
 */





