public class _113StockRoom {
    private  static int stock=10;

    public  void purchase(int qty){

        stock+=qty;
    }
    public void sell(int qty){
        stock-=qty;

    }
    public   static void printStock(String action){

        //   System.out.printf (action+": " +qty+ " items.Stock in Hand:"+ stock);

    }
    public static void main(String[] args) {
        _113StockRoom k1=new _113StockRoom ();
        k1.sell (5);

        k1.printStock ("Sold");

        _113StockRoom k2=new _113StockRoom ();
        k2.purchase (5);

        k2.printStock ("purchased");
    }

}
