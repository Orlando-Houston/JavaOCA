import java.io.IOException;

public class _94_Test {
    public static void main(String[] args) throws Exception { //and here
        X xobj=new X ();
        xobj.printFileContent ();

    }

}
class X{
    public  void printFileContent() throws Exception{ //problem  solved here
        /*
        code goes here
         */
        throw new IOException ();//problem was here

    }

}

