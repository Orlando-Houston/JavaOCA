
class TestCall{
    private  void  init(){
        System.out.println ("initialized");
    }
    private void start(){
        init ();
        System.out.println ("Started");
    }

}



public class Caller67 {
    public static void main(String[] args) {
        TestCall c = new TestCall ();
      // c.init();        comp error
       // c.start();  comp error



    }
}
