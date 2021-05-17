import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _16_LocalDate {
    public static void main(String[] args) {


        LocalDateTime dt= LocalDateTime.of (2021,2,5,
                8 ,1);
        dt.plusDays (30);
        dt.plusMonths (1);
        System.out.println (dt .format (DateTimeFormatter.ISO_DATE));

    }}
//2021-02-05


