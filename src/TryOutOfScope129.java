public class TryOutOfScope129 {
    public static void main(String[] args) {

        //     int ans ;  solve
        try{
            int num =10;
            int div =0;
            int   ans =num/div;


        }catch (ArithmeticException ae){
            //       ans =0;    // line n2 compilation error

        }catch (Exception e){
            System.out.println ("invalid calculation");
        }
        //      System.out.println ("Answer" +ans);//line n2 compile error
    }
}
