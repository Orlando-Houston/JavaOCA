import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main222 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList ("EN","FR","CH","JP");

        Iterator<String> itr=list.iterator ();
        while (itr.hasNext ()){
            String e=itr.next ();

            if (e=="CH"){
                break;
            }
            System.out.println (e+" ");
        }
    }

}
