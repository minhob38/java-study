import java.time.*;

public class DateTime {
    public static void main(String[] args) {
        /*
        - date / time -
        java.time package로 날짜와 시간을 다룰 수 있습니다.
        */
        System.out.println("\n=== date/time 객체 만들기 ===");
        /* now는 현재 날짜와 시간을 반환합니다. */
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime currentDateTimeZone = ZonedDateTime.now();

        System.out.println("currentDate는" + currentDate + "입니다.");
        System.out.println("currentTime은" + currentTime + "입니다.");
        System.out.println("currentDateTime은" + currentDateTime + "입니다.");
        System.out.println("currentDateTimeZone은" + currentDateTimeZone + "입니다.");

        /* of는 설정한 날짜와 시간을 반환합니다. */
        LocalDate setDate = LocalDate.of(2022, 1, 31);
        LocalTime setTime = LocalTime.of(10, 12, 30);
        LocalDateTime setDateTime = LocalDateTime.of(setDate, setTime);
        ZonedDateTime setDateTimeZone = ZonedDateTime.of(setDateTime, ZoneId.of("Asia/Seoul"));

        System.out.println("setDate는" + setDate + "입니다.");
        System.out.println("setTime은" + setTime + "입니다.");
        System.out.println("setDateTime" + setDateTime + "입니다.");
        System.out.println("setDateTimeZone은" + setDateTimeZone + "입니다.");
    }
}
