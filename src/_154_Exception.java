import java.util.ArrayList;

public class _154_Exception {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();  //  variable myList never used
        String[] myArray;   //   variable  "myArray" never used
        try{
            while (true) {
                myList.add ("My String");
            }
        }
        catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException");
        } catch (Exception e) {
            System.out.println("Caught an Exception");
        }

        System.out.println("Ready to use");

    }}
