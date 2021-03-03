package ans22_136;

public class Ans136 {
    public static void main(String[] args) {

        try {
            int num = 10;
            int div = 0;
            int  ans = num / div;
        }catch (ArithmeticException ae){
            //  ans=0;   //line 1   compilation error
            System.out.println ("Arithmetic exception");
        }catch (Exception e){
            System.out.println ("invalid calculation");
        }
        //   System.out.println (ans);  //line 2
    }
}
