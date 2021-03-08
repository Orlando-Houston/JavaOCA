import java.time.LocalDate;

public class _205LocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of (2012,01,30);
        date.plusDays (10);
        System.out.println (date);
    }
}
//2012-01-30
