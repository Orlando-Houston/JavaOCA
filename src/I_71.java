interface I_71 {
    public void displayI();
}
class C2_71{
    public void displayC2(){
        System.out.println ("C2");
    }
}
class C1_71 extends C2_71 implements I_71{
    public void displayI(){
        System.out.println ("C1");
    }

    public static void main(String[] args) {
        C2_71 obj1=new C1_71 ();
        I_71 obj2=new C1_71 ();

        //   C2_71 s=obj2;  comp error
        //   I_71 t=obj1; comp error

        //    t.displayI ();
        //    s.displayC2 ();

    }
}
//comp error



