package p_116;

public class C extends A {
    public void test(){
        System.out.println ("C");
    }

    public static void main(String[] args) {
        A b1=new A ();
        A b2= new A ();

        b1=(A) b2;

    //    A b3=(B )b2;

        b1.test ();
      //  b3.test ();//class  cast exception

    }

}
