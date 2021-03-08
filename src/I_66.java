interface I_66 {
    public void displayI();
}
abstract class C2_66 implements I_66{
    public void  displayC2(){
        System.out.println ("C2_66");
    }

}


class  C1_66 extends C2_66
{
    @Override
    public void displayI() {
        System.out.println ("C1_66");
    }

    public static void main(String[] args) {
        C2_66 obj1=new C1_66 ();
        I_66 obj2=new C1_66 ();

        C2_66 s=(C2_66) obj2;
        I_66 t=obj1;
        t.displayI ();
        s.displayC2 ();

    }
}
//C1_66
//C2_66


