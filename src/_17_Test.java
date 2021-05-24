public class _17_Test {
    int x,y;
   // public _17_Test(int x,int y){
   //     initialize (x,y);
   //    this.x=x;
   //   this.y=y;

  // }




    public void initialize(int x, int y){

        this. x=x*x;
        this.y=y*y;

    }

    public static void main(String[] args) {
        int x=3, y=5;
      _17_Test t=new _17_Test ();
        System.out.println (x + " "+ y);
        System.out.println (t.x + " "+ t.y);


    }
}
