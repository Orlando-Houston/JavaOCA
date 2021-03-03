class E1 extends Exception{}

class E2 extends RuntimeException{}

public class App190 {
    public void m1() throws  Exception{
        System.out.println ("m1.Accessed");
        throw  new E1();

    }
    public void m2(){
        System.out.println ("m2.Accessed");
        throw new E2();

    }
    public static void main(String[] args)throws Exception {
        int level=1;
        App190 obj=new App190 ();
        if (level<=5&&level>=3){
            obj.m1 ();
        }else{
            obj.m2 ();
        }



    }
}
