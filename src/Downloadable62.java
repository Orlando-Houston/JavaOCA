public interface Downloadable62 {  //line n1
    public void  download();
}
interface  Readable62 extends Downloadable62{ //line n2
    public void readBook();
}
abstract  class  Book62 implements Readable62{
    public void readBook(){
        System.out.println ("Read Book");
    }
}
class EBook62 extends Book62{    //line n3
    public  void readBook(){
        System.out.println ("Read E-Book");
    }
    public void download(){

    }

    public static void main(String[] args) {
        Book62 b1=new EBook62 ();
        b1.readBook ();
    }
}
