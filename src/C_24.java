

class A_24{
    A_24(){
        System.out.println ("A");
    }

}
class B_24 extends A_24{
    B_24(){
        System.out.println ("B");
    }

}


public class C_24  extends B_24 {
    C_24(){
        System.out.println ("C");

    }

    public static void main(String[] args) {
        C_24 c=new C_24 ();
    }
}

