public class Vehicle95 {
    String type ="4w";
    int maxSpeed =100;

    Vehicle95(String type,int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;

    }

}
class Car extends Vehicle95{
    String  trans;



    Car(String type, int maxSpeed,String trans){
        super(type,maxSpeed);


    }


}
