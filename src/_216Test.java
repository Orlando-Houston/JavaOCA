class Product216{
    double price;


    public static class _216Test {
        public void updatePrice(Product216 product216, double price) {
            price = price * 2;
            product216.price = product216.price + price;

        }

        public static void main(String[] args) {
            Product216 prt = new Product216 ();
            prt.price = 200;
            double newPrice = 100;

            _216Test t = new _216Test ();
            t.updatePrice (prt, newPrice);
            System.out.println (prt.price + " :" + newPrice);
        }
    }}
