package _151alpha;

public class Alpha {
    int ns;
    static  int s;
    Alpha  (int ns){
        if (s <ns){
            ns=s;
            this.ns=ns;
        }
    }
    void  doPrint(){
        System.out.println ("ns=" +ns+" " + "s:"+s);
    }
}
