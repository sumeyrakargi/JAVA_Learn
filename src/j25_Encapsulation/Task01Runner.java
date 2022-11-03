package j25_Encapsulation;

import java.util.Scanner;

public class Task01Runner {
    public static void main(String[] args) {

            // girilen değerleri...
        Scanner sc = new Scanner(System.in);
            System.out.print("agam adını giresen : ");
            String ad = sc.nextLine();
            System.out.print("agam yasını giresen : ");
            int yas = sc.nextInt();
            Student s1 = new Student(ad, yas);//ad ve yas data p'li cons parametre olarak göderildi s1 obj tanımlandı
            System.out.println("student name is " + s1.getName() + "\nHe is " + s1.getAge() + " years old");
        }}

