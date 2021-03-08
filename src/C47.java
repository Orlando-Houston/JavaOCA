public class C47 {
    public static void main(String[] args) {



        C47_1 c1 = (C47_1) new C47_2 ();

        C47_2 c2 = (C47_2) new C47_3 ();

        C47_2 c3 = (C47_2) new C47_1 ();  //cast exception

        C47_3 c4 = (C47_3) c2;
    }
}
class C47_1{

}
class C47_2 extends C47_1{


}
class  C47_3 extends C47_2{

}
