public class _123_App {
    String myStr="9009";

    public void doStuff(String str){
        int  myNum=0;

        try{
            String myStr=str;
            myNum = Integer.parseInt (myStr);

        }catch (NumberFormatException ne){
            System.out.println ("Error");

        }
        System.out.println ("myStr: " +myStr +"myNum:"+myNum);//9009,  7007
    }

    public static void main(String[] args) {
       _123_App obj= new _123_App ();
        obj.doStuff ("7007");
           System.out.println (obj.myStr);  //9009
    }
}
