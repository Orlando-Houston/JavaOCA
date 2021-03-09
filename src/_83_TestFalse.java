public class _83_TestFalse {
    public static void main(String[] args) {
        _83_TestFalse ts=new _83_TestFalse ();
        System.out.println (isAvailable+"  ");
        isAvailable=doStuff ();

        System.out.println (isAvailable);

    }
    public static boolean doStuff(){
        return  !isAvailable;
    }
    static boolean isAvailable=false;

}
