public class _129_Try_Catch {
    public static void main(String[] args) {

        try {

            int num=10;
            int div=0;
           int  ans=num/div;
        }catch (ArithmeticException ae){
          //  ans=0;  //line n1   comp error


        }catch (Exception e){
            System.out.println ("invalid calculation");
        }
      //  System.out.println ("Answer ="+ans);  // line n2  comp error
    }
}
