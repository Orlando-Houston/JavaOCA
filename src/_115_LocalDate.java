import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _115_LocalDate {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.now ();
        LocalDate date2=LocalDate.of (2021,5,2);
        LocalDate date3=LocalDate.parse ("2021-05-02",DateTimeFormatter.ISO_DATE);
        System.out.println (date1);
        System.out.println (date2);
        System.out.println (date3);

    }




    }

