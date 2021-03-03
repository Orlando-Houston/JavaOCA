public class App_123 {
    String myStr="9009";

    public void doStuff(String str){
        int  myNum=0;

        try{
            String myStr=str;
            myNum = Integer.parseInt (myStr);

        }catch (NumberFormatException ne){
            System.out.println ("Error");

        }
        System.out.println ("myStr: " +myStr +"myNum:"+myNum);
    }

    public static void main(String[] args) {
        App_123  obj=new App_123 ();
        obj.doStuff ("7007");
        //    System.out.println (obj.myStr);
    }
}
