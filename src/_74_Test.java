public class _74_Test {
    void readCard(int cardNo)throws Exception{
        System.out.println ("Reading card");

    }
    void checkCard(int cardNo)throws RuntimeException{
        System.out.println ("Checking card");

    }
    public static void main(String[] args)throws  Exception {
        _74_Test ex=new _74_Test ();
        int cardNo=12344;
        ex.readCard (cardNo);  //line n1

        ex.checkCard (cardNo);//line n2

    }
}
