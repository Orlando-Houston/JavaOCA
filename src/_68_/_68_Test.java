package _68_;

import java.io.IOException;

public class _68_Test {
    public static void main(String[] args) {
        try{
            method1 ();

        }catch (MyException_68 ne){

        }
    }

    public static void method1(){      //line n1

        try{
        throw 3>10 ? new MyException_68 ():new IOException ();
    }

        catch(IOException ie){
            System.out.println ("I");

        }
        catch (Exception re){
            System.out.println ("B");
        }
    }

}
