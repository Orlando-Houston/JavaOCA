import java.io.IOException;

class Test6{
    public void printFileContent()throws IOException{
        //code here
        throw  new IOException ();
    }
}


public class X6 {
    public static void main(String[] args)throws IOException {
        Test6 t=new Test6 ();

        t.printFileContent ();



    }

}
