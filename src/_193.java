public class _193 {
    public static void main(String[] args) {
        int sum =0;
        int xVal=1;

        for (  xVal =1;xVal<5;xVal++){
            sum=sum+xVal;


            System.out.println ("the sum of "+xVal+ "number is"+sum);
        }

       System.out.println ("the sum of "+xVal+ "number is"+sum);
//        comp error ..Why.. xVal outside of scope
    }
}

//the sum of 1number is1
//the sum of 2number is3
//the sum of 3number is6
//the sum of 4number is10
