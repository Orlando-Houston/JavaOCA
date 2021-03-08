interface I1_212 {
}
class P1_212{}

class P2_212 extends P1_212 implements I1_212{

    public static void main(String[] args) {
        P1_212 obj1=new P1_212 ();

        P2_212 obj2=new P2_212 ();

        I1_212 obj3=new P2_212 ();

        boolean r1=obj1 instanceof P2_212; //false

        boolean r2=obj2 instanceof P1_212;//true

        boolean r3=obj3 instanceof I1_212;//true

        System.out.println (r1+ " "+ r2 +" "+ r3);

    }
}
