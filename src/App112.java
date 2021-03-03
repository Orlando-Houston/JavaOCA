public class App112 {
    int count;  // instance variable
    public static void displayMsg(){
        //  count++;    //does not work inside static method
        //   System.out.println ("Welcome"+"Visit:" +count);
    }
    public static void main(String[] args) {
        App112.displayMsg ();
        App112.displayMsg ();

    }
}
