public class _189_Test {
    public static int stVar=100;   //member of class
    public int var=200; //instance variable
    public String toString(){
        return stVar +":"+var;
    }

    public static void main(String[] args) {
        _189_Test t1= new _189_Test ();
        t1.var=300;
        System.out.println (t1);

        _189_Test t2= new _189_Test ();
        t2.stVar=300;
        System.out.println (t2);
    }


}
//100:300
//300:200
