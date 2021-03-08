package TestCaller208;

import java.lang.reflect.Method;

class CallerSolve208{
    private  void init(){
        System.out.println ("initialized");
    }
    private  void start(){
        init ();
        System.out.println ("started");
    }

}

public class TestCallerSolve208 {
    public static void main(String[] args)throws Exception {

        CallerSolve208 c=new CallerSolve208 ();
        //   c.start();
        // c.init();

//       solve
        Method m=CallerSolve208.class.getDeclaredMethod ("init");
        Method m1=CallerSolve208.class.getDeclaredMethod ("start");

        m.setAccessible (true);
        m.invoke (c);

        m1.setAccessible (true);
        m1.invoke (c);

    }}
//    initialized
//initialized
//started


