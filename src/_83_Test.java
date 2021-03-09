public class _83_Test {
    public static void main(String[] args) {
        _83_Test ts=new _83_Test ();
        System.out.println (isAvailable+"  ");
        isAvailable=doStuff ();

        System.out.println (isAvailable);

    }
    public static boolean doStuff(){
        return  !isAvailable;
    }
    static boolean isAvailable=true;
}
