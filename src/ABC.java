

public class ABC {


}

class  A1{
    public A1(){
        System.out.println ("A1");

    }
}
class B1 extends A1{
    public B1(){
        System.out.println ("B1");
    }
}

class C1 extends B1{
    C1(){
        System.out.println ("C1");
    }

    public static void main(String[] args) {
        A1 a = new A1 ();//A1
        A1 a1 = new B1 ();//  A1 B1
        A1 a2 = new C1 (); //A1,B1,C1


        //   B1 b1=new A1 ();  comp error
        B1 b1 = (B1) new A1 ();//A1


        C1 c1 = new C1 ();//C1
        // C1 c2=new B1 ();  compile error
        C1 c2 = (C1) new B1 ();// A1 B1
    }
    }



