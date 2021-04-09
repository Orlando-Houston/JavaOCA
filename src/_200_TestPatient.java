import java.util.ArrayList;
import java.util.List;

class Patient{
    String name;
    public Patient(String name){
        this.name=name;
    }
}

public class _200_TestPatient {
    public static void main(String[] args) {
        List ps=new ArrayList ();
        Patient p2=new Patient ("Mike");
        ps.add(p2);
        //insert code here
//        Which code fragment, when inserted at line 14, enables the code to print Mike Found?
 int f=ps.indexOf (p2);



        if (f>=0){
            System.out.println ("Mike found");
        }
    }

}
