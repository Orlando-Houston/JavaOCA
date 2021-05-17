package _188;

public class Test {
    public static void main(String[] args) {
        CheckingAccount acct=new CheckingAccount ((int)(Math.random ()*1000));
        // line n1
       // acct.setAmount (-acct.getAmount ());

       acct.amount=0;
        acct.setAmount (0);
     //   acct.getAmount ()=0;
      //  acct.changeAmount (0);

        acct.changeAmount (-acct.getAmount ());

        System.out.println (acct.getAmount ());
    }
}
