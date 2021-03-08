public class Planet89 {
    public  String name;
    public int moons;

    public Planet89(String name,int moons){
        this.name=name;
        this.moons=moons;
    }

    public static void main(String[] args) {
        Planet89 [] planets= {
                new Planet89 ("Mercury",0),
                new Planet89 ("Venus",0),
                new Planet89 ("Earth",1),
                new Planet89 ("Mars",2)
        };
        System.out.println (planets);
        System.out.println (planets[2]);
        System.out.println (planets[3].name);
        System.out.println (planets[2].moons);
    }

}
