package _177;

public class Peacock extends Bird {
    public void dance(){
        System.out.println ("Dance...");
    }

    public static void main(String[] args) {
        /*
        Bird b=new Bird ();
        b.fly ();   Fly...

        Peacock  p= new Peacock ();
        p.dance ();   Dance..


        Bird b=new Bird ();Peacock p=(Peacock) b;
        p.fly();
        p.dance();



        Peacock b=new Peacock();Bird p= (Bird) b;
        p.fly ();
    //    p.dance ();  //we need to dreate dance method inside the Bird class

         */

        Bird b=new Peacock ();Peacock p=(Peacock) b;
        p.fly();
        p.dance();
    }
}
