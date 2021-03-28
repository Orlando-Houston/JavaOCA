public class _42_StringBuilder {
    //    which statement will empty the contents of aStringBuilder named sb

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder (123);
        //    sb.delete ();
//        sb.deleteAll ().
//        sb.delete (0,sb.size());
        sb.delete (0,sb.length ());
//        sb.removeAll();
    }
}
