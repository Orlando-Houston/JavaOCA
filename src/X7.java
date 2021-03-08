public class X7 {
    static  int i;
    int j;

    public static void main(String[] args) {
        X7 x1=new X7 ();
        X7 x2=new X7 ();

        x1.i=3;
        x1.j=4;
        x2.i=5;
        x2.j=6;

        System.out.println (x1.i+ " "+x1.j +"\n"+  x2.i + " "+ x2.j);
    }
}
