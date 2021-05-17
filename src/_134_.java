import java.util.ArrayList;
import java.util.List;

public class _134_ {
    public static void main(String[] args) {
        List<String>arrayList=new ArrayList<> ();
        arrayList .add ("Tech");
       arrayList.add ("Expert");
        arrayList.set (0,"Java");

        System.out.println (arrayList);

        arrayList.forEach (a->a.concat ("Forum"));   //ignore  why
        System.out.println (arrayList);

        arrayList.replaceAll (s -> s.concat ("Group"));
        System.out.println (arrayList);
    }
}
