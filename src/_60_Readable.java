public interface _60_Readable {
    public void readBook();
    public void setBookMark();
}

abstract class Book60 implements  _60_Readable{   //line n1
    public void readBook(){
//        line n2

    }
}
class  EBook60 extends Book60{
    public void readBook(){   //line n3
    }
    public  void setBookMark(){ //line n4

    }

    public static void main(String[] args) {
        Book60 b1=new EBook60 ();

    }
}
