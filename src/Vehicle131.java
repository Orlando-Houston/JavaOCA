public class Vehicle131 {
    int x;
    Vehicle131(){
        this(10);

    }
    Vehicle131(int x){
        this.x=x;
    }
}
class Car131 extends  Vehicle131{
    int y;
    Car131(int x,int y){
        super(x);

        this.y=y;

    }
    public String toString(){
        return super.x+ " "+ this.y;
    }

    public static void main(String[] args) {
        Vehicle131 y=new Car131 (10,20);
        System.out.println (y);
    }
}
