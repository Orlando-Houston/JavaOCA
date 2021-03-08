public class FieldInit153 {
    Character c;    //null
    boolean b;  //false
    float  f;  //0.0

    void printAll(){
        System.out.println ("c =" +c );
        System.out.println ("b =" +b );
        System.out.println ("f =" +f );
    }

    public static void main(String[] args) {
        FieldInit153 f=new FieldInit153 ();
        f.printAll ();
    }
}
