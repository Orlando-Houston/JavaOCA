public class Planet135 {
    public  String name;
    public int moons;

    public Planet135(String name,int moons){
        this.name=name;
        this.moons=moons;
    }

    public static void main(String[] args) {
        Planet135 [] planets= {
                new Planet135 ("Mercury",0),
                new Planet135("Venus",0),
                new Planet135 ("Earth",1),
                new Planet135 ("Mars",2)
        };
        System.out.println (planets);
        System.out.println (planets[2]);
        System.out.println (planets[2].name);
        System.out.println (planets[2].moons);
    }



}
