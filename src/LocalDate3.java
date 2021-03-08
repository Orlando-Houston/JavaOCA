import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate3 {
    public static void main(String[] args) {
        String date= LocalDate.parse ("2021-02-04").
                format (DateTimeFormatter.ISO_DATE_TIME);

        System.out.println (date);
    }

}
