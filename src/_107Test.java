public class _107Test {
    public static void main(String[] args) {
        boolean a= new Boolean (Boolean.valueOf (args[0]));
        boolean b=new Boolean (args[1]);
    }
}
//javac Test107.java
//java Test107  1 null

//Returns a Boolean with a value represented by the specified string.
// The Boolean returned represents a true value if the string argument is not
// null and is equal, ignoring case, to the string "true".
// Otherwise, a false value is returned, including for a null argument.



/*
public static void main(String[] args) {
    boolean a = new Boolean(Boolean.valueOf("TRUE"));
    boolean b =new Boolean("null");
    System.out.println(a);
    System.out.println(b);

//    Result is: true false
}

 */


