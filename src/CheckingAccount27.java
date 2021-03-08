public class CheckingAccount27 {
    public int amount;
    //    line1
    public CheckingAccount27(){

        this.amount=100;
    }
}

class Account27{
    public static void main(String[] args) {

        CheckingAccount27 acct=new CheckingAccount27 ();
//        line2
        acct.amount=100;

        System.out.println (acct.amount);


    }
}
