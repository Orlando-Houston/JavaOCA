public class _191_Vowel {
    private char var;

    public static void main(String[] args) {
        char var1='a';
        char var2=var1;
        var2='e';

        _191_Vowel obj1=new _191_Vowel ();
        _191_Vowel obj2=new _191_Vowel ();
        obj2=obj1;
        obj1.var='i';
        obj2.var='o';

        System.out.println (var1+" ,"+var2);
        System.out.println (obj1.var+" ,"+ obj2.var);
    }
}
//a ,e
//o ,i
