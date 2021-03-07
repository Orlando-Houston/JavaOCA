public class App149 {
    public static void main(String[] args) {
        Boolean[] bool= new Boolean[2];

        bool[0]=new Boolean (Boolean.parseBoolean ("true"));//true
        bool[1]=new Boolean (null); //false

        System.out.println (bool[0]+ " "+bool[1]);
    }
}

// true false