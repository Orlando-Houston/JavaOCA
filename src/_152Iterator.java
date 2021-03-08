import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _152Iterator {
    public static void main(String[] args) {
        List<String> list= Arrays.asList ("A","B","C","D");
        Iterator<String> itr= list.iterator ();
        while (itr.hasNext ()){
            String e=itr.next ();
            if (e=="C"){
                break;
            }
            else{
                //    continue;
                System.out.print (e);
            }
        }
    }
}
