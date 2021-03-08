public class _128_2MyField {
    int x;
    int y;
    public  void doStuff(int x , int y) {
        this. x=x;
        y=this.y;

    }

    public  void display() {
        System.out.print (x + " "+ y + " :");

    }
    public static void main(String[] args) {
        _128_2MyField m1=new _128_2MyField  ();
        m1.x=100;
        m1.y=200;
        m1.display ();

        _128_2MyField m2=new _128_2MyField ();
        m2.doStuff (m1.x  , m1.y);

        m2.display ();


    }

}
