public class SumTest145 {
    public static void doSum(Integer x, Integer y) {
        System.out.println ("Integer sum is"+ (x+y));
    }
    public static void doSum(double x, double y) {
        System.out.println ("double sum is"+ (x+y));
    }
    public static void doSum(float x, float y) {
        System.out.println ("double sum is"+ (x+y));
    }

    public static void main(String[] args) {
        doSum (10,20);
        doSum (10.0,20.0);
    }

}
// float sum is 30.0 double sum is 30.0
