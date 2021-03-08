public class Discount59 {
    public static void main(String[] args) {
        double discount=0;
        int qty=Integer.parseInt (args[0]);
//        line n1
        discount = qty>=90 ? 0.5: qty>80 ? 0.2 :0;
    }
}
