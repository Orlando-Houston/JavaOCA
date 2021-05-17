public class _122_DataType {
    public static void main(String[] args) {
        Short s1=200;
        Integer s2=400;
        //String s3=(String)  (s1+s2);  //line n1  compilation error
        Long s4=(long)s1+s2;     //line n2
        System.out.println ("sum is s4 : " +s4);
    }
}
