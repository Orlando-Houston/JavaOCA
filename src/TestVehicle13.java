
class Vehicle13{
    int x;
    Vehicle13(){
        this(10);  //line 1
    }
    Vehicle13(int x){
        this.x=x;

    }

}
class Car13 extends Vehicle13{
    int y;
    Car13(){
        super(10);//line 2


    }
    Car13(int y){
        super(y);//bu olmasa cevap 10 20
        this.y=y;

    }

    public String toString(){
        return super.x + " "+this.y;
    }

}

public class TestVehicle13 {
    public static void main(String[] args) {

        Vehicle13 y=new Car13 (20);
        y.toString ();
        System.out.println (y);
    }

}
//20  20


