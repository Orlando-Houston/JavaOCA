import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _28ArrListRemoveIfSample {
    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<> (Arrays.asList (arr));
        arrList.removeIf (s -> s.length ()<=2);
        System.out.println (arrList);
    }
}
