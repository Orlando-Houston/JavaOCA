public class App124 {
    String myStr="7007";

    public void doStuff(String str){
        int  myNum=0;


            String myStr=str;
            myNum = Integer.parseInt (myStr);


        System.out.println ("myStr: " +myStr +"myNum:"+myNum);
    }

    public static void main(String[] args) {
        App124  obj=new App124 ();
        obj.doStuff ("9009");
            System.out.println (obj.myStr);
    }
}

//myStr: 9009myNum:9009
 //       7007

