package j15_Arrays;

import java.util.Scanner;

public class Salyangoz {

    /* Task-> girilen değere göre  salyangoz matris  create eden code create ediniz
        input :3
        output:
                1       2       3
                8       9       4
                7       6       5

         input :4
         output :
                1       2       3       4
                12      13      14      5
                11      16      15      6
                10      9       8       7
         */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int boyut = sc.nextInt();
        int slyngz [][]=new int[sc.nextInt()][sc.nextInt()];

        for (int i = 1; i <=boyut ; i++) {
            for (int j = 1; j <=boyut ; j++) {
                System.out.println(slyngz[1][j]);

                slyngz[i][j]=boyut-j+1;


            }}}}