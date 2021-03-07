import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_148 {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.of (2021,03,7,8,36);
        dt.plusDays (30);
        dt.plusMonths (1);
        System.out.println (dt.format (DateTimeFormatter.ISO_DATE_TIME));
    }
}
