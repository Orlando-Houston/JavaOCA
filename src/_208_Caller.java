
class TestCal {
    private void init() {
        System.out.println ("initialized");
    }

    private void start() {
        init ();
        System.out.println ("Started");
    }
}




public class _208_Caller {
    public static void main(String[] args) {
        TestCal c = new TestCal ();
        // c.init();        comp error
        // c.start();  comp error


    }}



