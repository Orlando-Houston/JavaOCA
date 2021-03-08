
class CD9{
    int r;
    CD9(int r){
        this.r=r;
    }
}

class DVD9 extends CD9{
    int c;
    DVD9(int r,int c){
        super(r);
        this.c=c;

    }

}


public class _9TestCD {
    public static void main(String[] args) {
        DVD9 dvd=new DVD9 (10,20);
        System.out.println (dvd.c+ "  "+ dvd.r);

    }

}
