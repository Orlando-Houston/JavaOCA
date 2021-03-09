import java.util.ArrayList;
import java.util.List;

public class _95_Product {
    int id;
    String name;
   _95_Product(int id,String name){
        this.id=id;
        this.name=name;

    }

}
class Shop{
    public static void main(String[] args) {
        List<_95_Product> list=new ArrayList<> ();
        list.add (new _95_Product (10,"IceCream"));
        list.add (new _95_Product (11,"Chocolate"));

        _95_Product p1=new _95_Product (10,"IceCream");
        System.out.println (list.indexOf (p1));
    }
}

