public class Wrapp123 {
    public static void main(String[] args) {
        double discount=0;
        int qty=Integer.parseInt (args[0]);

        discount=(qty>80) ? 0.2 :(qty >=90) ?  0.5  :0;


        System.out.println (discount);
    }


}
