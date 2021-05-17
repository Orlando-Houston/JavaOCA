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

