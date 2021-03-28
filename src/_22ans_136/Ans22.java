package _22ans_136;

public class Ans22 {
    public static void main(String[] args) {
        int ans;
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        }catch (ArithmeticException ae){
            ans=0;   //line 1
        }catch (Exception e){
            System.out.println ("invalid calculation");
        }
        //   System.out.println (ans);  //line 2
    }
}
