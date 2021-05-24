public class Count37 {
    public static void main(String[] args) {
        int data[]={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;

        for (int e:data){
            if (e !=key){
                count ++;
                continue;
                // count++;  comp error

            }
           // count++;
        }
        System.out.println (count);//2
    }
}
//Based on provided error, if put count before “continue”,
// compilation will be successful with following result:
//After the if condition is true, “continue” will always be executed, making the
// count++ unreachable.
//Also, there is a colon instead of semicolon after “continue”.
// Not sure on whether this is a typo in the question or this is intentionally
// added. If so, this also makes Answer A the correct answer.
