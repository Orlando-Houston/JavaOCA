import java.util.function.Predicate;

public class _210_Predicate {
    public static void main(String[] args) {
        Predicate<Integer>p= (n)-> n%2==0;

        boolean s=p.test (100);

            System.out.println (s);

    }
}
