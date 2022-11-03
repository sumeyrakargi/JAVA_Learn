package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C08_Period {
    public static void main(String[] args) {
        //Period--> iki tarih arasında geçen tekrarlanabilen zamanı tutar.
        LocalDate today=  LocalDate.now();
        LocalDate umtBirthDay=  LocalDate.of(2013,01,11);
        Period fark=Period.between(today,umtBirthDay);
        System.out.println("fark = " + fark);//fark = P-9Y-9M-15D
        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());//fark.toTotalMonths() = -117
        System.out.println("fark.getDays() = " + fark.getDays());//-15
        System.out.println("   ***   ");
        Period period5gun=  Period.ofDays(5);//5 Günde bir tekrarlanan period
        Period period7ay=  Period.ofMonths(7);//7 ayda bir tekrarlanan period
        Period periodx=  Period.ofMonths(7).ofDays(21);//21 gun--> periodda sondaki periyot çalışır
        //Trick--> periyot tanımlamada birdençok periyot tanımlanırsa son parametre çalışır diğerleri ezilir

        today=today.plus(period5gun);
        System.out.println("today = " + today);//today = 2022-10-31
        today=today.minus(period7ay);
        System.out.println("today = " + today);//today = 2022-03-31
        today=today.plus(periodx);
        System.out.println("today = " + today);//today = 2022-04-21
        //Task 05.09.2022 tarihinde başlayan kurs 9 ay ol

        LocalDate kursbaslngc=  LocalDate.of(2022,9,05);
        Period kurs=  Period.ofMonths(9);
        System.out.println("kurs bitiş tarihi : "+kursbaslngc.plus(kurs));//kurs bitiş tarihi : 2023-06-05

        //System.out.println("kurs bitis tarihi : "+kursBasla.plus(kursSure).format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
}
