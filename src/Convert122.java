public class Convert122 {
    public static void main(String[] args) {
        Short s1=200;
        Integer s2=400;
        //  String s3=(String)(s1+s2);//compile error
        Long s4=(long) s1+s2;
        System.out.println ("sum is" +s4);
    }
}
