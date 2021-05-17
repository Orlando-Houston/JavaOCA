package _169_clothing.pants;


import _169_clothing.Shirt;


import static _169_clothing.Shirt.getColor;

public class Jeans {
    public void matchShirt(){
        String color= Shirt.getColor ();
        if (color.equals("Green")){
            System.out.print ("Fit");
        }
    }

    public static void main(String[] args) {
        Jeans trousers=new Jeans ();
        trousers.matchShirt ();
    }
}
