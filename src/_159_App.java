class Book{
    int pages;
}

public class _159_App {
    int count;
    public void method(Book x,int k){
        x.pages=100;
        k=200;

    }

    public static void main(String[] args) {
        _159_App obj=new _159_App ();
        Book objBook= new Book ();
        System.out.println (objBook.pages+":"+obj.count); //0   0
       obj.method (objBook, obj.count);

        System.out.println (objBook.pages+":"+ obj.count);  //100   0
    }

}
