public class _82_Alpha {
    int ns;
    static  int s;
    _82_Alpha(int ns){
        if (s<ns) {
            s=ns;
            this. ns=ns;
        }
        }
        void doPrint(){
            System.out.println ("ns="+ns +"s"+s);
        }

    }


class TestA{
    public static void main(String[] args) {
        _82_Alpha ref1=new _82_Alpha (50);
        _82_Alpha ref2=new _82_Alpha (125);
        _82_Alpha ref3=new _82_Alpha (100);
        ref1.doPrint ();
        ref2.doPrint ();
        ref3.doPrint ();

    }

}
