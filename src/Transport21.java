

class Vehicle21{
    Vehicle21(){
        System.out.println ("Vehicle21");
    }

}

class Bus21 extends Vehicle21{
    Bus21(){
        System.out.println ("Bus21");
    }
}

public class Transport21 {
    public static void main(String[] args) {

        Vehicle21 v=new Vehicle21 ();
        Vehicle21 v1=new Bus21 ();

        Bus21 b=new Bus21 ();

    }

}
//Vehicle21
//Bus21


