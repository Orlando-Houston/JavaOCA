public class _94_Product {
    int id;
    String name;
    public   _94_Product(int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        _94_Product p1=new _94_Product (101,"Pen");
        _94_Product p2=new _94_Product (101,"Pen");

        _94_Product p3=p1;

        boolean ans1=p1==p2;
        boolean ans2=p1.name.equals (p2.name);
        System.out.println (ans1+" "+ans2);

    }
}
