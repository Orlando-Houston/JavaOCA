import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _3_LocalDate {
    public static void main(String[] args) {
        String date= LocalDate.parse ("2021-02-04").
                format (DateTimeFormatter.ISO_DATE_TIME);

        System.out.println (date);
    }

}
//UnsupportedTemporalTypeException: Unsupported field: HourOfDay
