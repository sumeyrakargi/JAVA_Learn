package j22_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {
        LocalDate today=  LocalDate.now();
        LocalDate falangun=today.minusDays(2);
        LocalDate filangun=today.plusDays(3);
        System.out.println("today = " + today);//today = 2022-10-26
        System.out.println("falangun = " + falangun);//falangun = 2022-10-24
        System.out.println("filangun = " + filangun);//filangun = 2022-10-29

        System.out.println(today.isBefore(falangun));//false
        System.out.println(today.isAfter(falangun));//true
        System.out.println(today.isBefore(filangun));//true

        System.out.println("today.isLeapYear() = " + today.isLeapYear());//false
        int fark=today.compareTo(falangun);
        System.out.println("fark = " + fark);//2
        System.out.println("falangun.compareTo(filangun) = " + falangun.compareTo(filangun));//-5
    }
}
