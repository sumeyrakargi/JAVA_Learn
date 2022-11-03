package j22_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {
        LocalTime gece=LocalTime.of(0,0);
        LocalTime oglen=LocalTime.of(13,0);
        Duration fark=Duration.between(gece, oglen);
        System.out.println(fark);
        System.out.println("fark.getSeconds() = " + fark.getSeconds());//fark bilgisindeki saniye datası alındı

        System.out.println("fark.toHours() = " + fark.toHours());
        System.out.println("fark.toMinutes() = " + fark.toMinutes());//fark bilgisi dakikay cevirildi

        System.out.println("fark.toMillis() = " + fark.toMillis());
    }
}
