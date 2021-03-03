public class App119 {
    String greet="Welcome";
    public App119(){
        String greet ="Hello";
    }
    public void  setGreet(){
        String greet= "Good Day";
    }
    public static void main(String[] args) {
        App119 t=  new App119 ();
        String greet ="Good Luck";
        System.out.println (t.greet);
    }
}
