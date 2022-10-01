package J03_ScannerClass.tasks3;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"  */


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your mid-term grade : ");
        int mid= sc.nextInt();

        Scanner in =new Scanner(System.in);
        System.out.println("Enter your final grade : ");
        int finl= sc.nextInt();

        Scanner inpt =new Scanner(System.in);
        System.out.println("Enter your project grade : ");
        int prj= sc.nextInt();

        System.out.println((mid*0.3)+(finl*0.5)+(prj*0.2));


    }
}
