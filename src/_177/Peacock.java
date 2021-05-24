package _177;

public class Peacock extends Bird {
    public void dance(){
        System.out.println ("Dance...");
    }

    public static void main(String[] args) {
        /*
        Bird b=new Peacock ();
        b.fly ();
        */

/*
      Bird b=new Bird ();
       b.fly ();        //  Fly...
     //   b.dance();
     */

        Peacock  p= new Peacock ();  //answer
        p.dance (); //  Dance..
       p.fly ();           //fly


  /*
        Bird b=new Bird ();
        Peacock p=(Peacock) b;
        p.fly();
        p.dance();
        */


/*
        Peacock b=new Peacock();
        Bird p= (Bird) b;
        p.fly ();
        p.dance ();  //we need to create dance method inside the Bird class

        */


       Bird b=new Peacock ();
        Peacock p1=(Peacock) b;
       p1.fly();
        p1.dance();
    }
}
