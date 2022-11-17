package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    /*
    Task->
Node değerleri "yakup","javaCAN","javaTAR","Teykinay" olan bşe linkedLst create ediniz.
Girilen bir String değeri linkedListte varlığını kmontrol edip varss slilp "Agam elelman halledildi"
yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

     */
    public static void main(String[] args) {


    LinkedList<String>ll1 = new LinkedList<>(Arrays.asList("yakup","javaCAN","javaTAR","Teykinay" ));
    Scanner sc= new Scanner(System.in);
        System.out.println("aradığınız stringi giriniz");
        String str=sc.next();
        if(ll1.remove(str)){
            System.out.println("silindi");
        }else System.out.println("String bulunmadı");
        System.out.println(ll1);

}}
