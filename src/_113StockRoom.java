public class _113StockRoom {
    private  static int stock=10;
    static  int qty;

    public  void purchase(int qty){

        stock+=qty;
    }
    public void sell(int qty){
        stock-=qty;

    }
    public   static void printStock(String action){

         System.out.printf (action+": " +qty+ " items.Stock in Hand:"+ stock);

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
//You want the code to print:
//Sold: 5 items. Stock in Hand: 5 Purchased: 5 items. Stock in Hand: 10?
// Which action enables the code to
//print this?
//C. Declare the stock and qty variables and the printStock() method static.
