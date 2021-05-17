import java.time.LocalDate;

public class _105_Date {
    public static void main(String[] args) {
        LocalDate date= LocalDate.of (2021,01,32);
        date.plusDays (10);
        System.out.println (date);

    }
}
// LocalDate date= LocalDate.of (2021,01,30);
//        date=date.plusDays (10);
//        System.out.println (date);
//2021,02,9