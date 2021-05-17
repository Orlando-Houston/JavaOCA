package Base104;

public class DerivedB extends DerivedA{
    public void test(){
        System.out.println ("DerivedB");
    }

    public static void main(String[] args) {
        Base b1=new DerivedB ();
        Base b2= new Base ();
        Base b3=new DerivedB ();

        Base b4 =b3;
        b1=b2;

        b1.test ();// DerivedA
        b4.test ();//DerivedB
    }
}
