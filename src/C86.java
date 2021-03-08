


class A{
    public void test(){
        System.out.println ("A");
    }

}
class B extends A{
    public void test(){
        System.out.println ("B");
    }

}




public class C86 extends A {
    public void test(){
        System.out.println ("C");
    }

    public static void main(String[] args) {
        A b1=new  A ();
        A b2=new C86 ();

        //  A b3=  b2; there is no problem
        A b3= (B) b2;//classCastException redundant

        b1= b2;

        b1= (A) b2;

        b1.test ();
        b3.test ();

    }

}
