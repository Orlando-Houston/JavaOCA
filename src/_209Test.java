public class _209Test {
    int x,y;

    public _209Test(int x,int y){
        initialize (x,y);

    }
    public  void initialize(int x, int y){
        this.x=x*x;
        this.y=y*y;

    }
    public static void main(String[] args) {

        int x=9, y=5;
        _209Test t=new _209Test(x,y);

        t.x=10;
        t.y=20;

        System.out.println (t.x  +" "+ t.y);


        System.out.println (x + " "+y);

    }

}
