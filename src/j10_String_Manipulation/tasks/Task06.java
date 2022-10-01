package j10_String_Manipulation.tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {


        //TASK--> Girilen Stringin son karakterini silen code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("String girin");
        String str= sc.next();
        System.out.println(str.substring(0,str.length()-1));



    }
}
