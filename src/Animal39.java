public class Animal39 {
    String type="Canine";
    int maxSpeed =60;

    Animal39(){

    }
    Animal39(String type,int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }

}
class WildAnimal39 extends Animal39{
    String bounds;

    WildAnimal39(String bounds){
//        line n1
        this.bounds=bounds;

    }
    WildAnimal39(String type,int maxSpeed,String bounds){
        super(type,maxSpeed);
        this.bounds=bounds;
//        line2

    }

    public static void main(String[] args) {
        WildAnimal39 wolf=new WildAnimal39 ("Long");
        WildAnimal39 tiger=new WildAnimal39 ("Feline ",80,"Short");

        System.out.println (wolf.type+ " "+wolf.maxSpeed+" "+wolf.bounds);
        System.out.println (tiger.type+ " "+tiger.maxSpeed+" "+tiger.bounds);
    }

}
