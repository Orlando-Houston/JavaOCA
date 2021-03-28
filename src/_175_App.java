public class _175_App {
    int foo;
    static int bar;

    static void process(){
        //foo +=10; instance variable can't write inside the static method..compiler error
        bar +=10;
    }

    public static void main(String[] args) {
        _175_App firstObj= new _175_App ();
        _175_App.process ();
        System.out.println (firstObj.bar);


        _175_App secondObj=new _175_App ();
        _175_App.process ();
        System.out.println (secondObj.bar);
    }
}
