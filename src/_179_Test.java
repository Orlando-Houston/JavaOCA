public class _179_Test {
    static  int count =0;
    int  i=0;

    public void  changeAccount(){
        while (i<5){
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        _179_Test check1= new _179_Test ();
        _179_Test check2= new _179_Test ();
       check1.changeAccount ();
       check2.changeAccount ();
        System.out.println (check1.count+" :" +check2.count);

       System.out.println (check1.i+" :"+check2.i);

    }

}
