package j22_DateTime;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate today= LocalDate.now();
        System.out.println("today = " + today);//today = 2022-10-25
        System.out.println("today.getYear() = " + today.getYear()); //2022
        System.out.println("today.getDayOfMonth() = " + today.getDayOfMonth()); //25
        System.out.println("today.getDayOfWeek() = " + today.getDayOfWeek()); //TUESDAY
        System.out.println("today.getDayOfYear() = " + today.getDayOfYear()); //298
        System.out.println("today.getMonth() = " + today.getMonth()) ;//OCTOBER

        LocalDate date1= LocalDate.of(1986, 07, 27);
        System.out.println("date1.getDayOfYear() = " + date1.getDayOfYear());//208
        System.out.println("date1.getMonth() = " + date1.getMonth());//JULY


        //verilen bir tarihin öncesi ve sonrasına gitmek
        System.out.println("date1.plusMonths(2) = " + date1.plusMonths(2));//1986-09-27
        System.out.println("date1.plusDays(20) = " + date1.plusDays(20));//1986-08-16
        System.out.println("date1.plusWeeks(3) = " + date1.plusWeeks(3));//1986-08-17
        System.out.println("date1.minusYears(2) = " + date1.minusYears(2));//1984-07-27
        System.out.println("date1.minusDays(56) = " + date1.minusDays(56));//1986-06-01
        System.out.println(today.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2));//2020-10-28
    }

}
