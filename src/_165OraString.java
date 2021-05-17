public class _165OraString {
    String s;

    public boolean equals(_165OraString str){
        return  this .s.equalsIgnoreCase (str.toString ());
    }
    _165OraString(String s){
        this.s=s;
    }

}
class TestOraString{

    public static void main(String[] args) {
        String s1= "Moon";
        _165OraString s2=  new _165OraString ("Moon");

        if((s1.equals ("Moon"))&& (s2.equals("Moon"))){
            System.out.println ("A");

        }else{
            System.out.println ("B");
        }
        if (s1.equalsIgnoreCase (s2.s)){
            System.out.println ("C");
        }else{
            System.out.println ("D");
        }

    }


}
