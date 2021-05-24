package _109_;

public class ElectricAccount {
    private  double kWh;
    private double rate=0.07;
    private double bill;

    public void  addKWh(double kWh){


        this.kWh +=kWh;
        this.bill=this.kWh*this.rate;

    }

    public static void main(String[] args) {
        ElectricAccount acc=new ElectricAccount ();
        acc.addKWh (acc.kWh);
    }
}
//Any amount of electricity used by a customer (represented by an
// instance of the Customer class) must
//contribute to the customer's bill (represented by the member variable bill)
// through the useElectricity
//method.
//An instance of the Customer class should never be able to tamper with or
// decrease the value of the
//member variable bill.
//How should you write methods in the ElectricAccount class at line n1 so
// that the member variable bill is
//always equal to the value of the member variable kwh multiplied by the
// member variable rate?

