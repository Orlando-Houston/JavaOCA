package TestCaller208;
class Caller208{
    private  void init(){
        System.out.println ("initialized");
    }
    private  void start(){
        init ();
        System.out.println ("started");
    }

}

public class TestCaller208 {
    public static void main(String[] args) {

        Caller208 c = new Caller208 ();
        //   c.start();
        // c.init();

    }}
