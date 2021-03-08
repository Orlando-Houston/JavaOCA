public class ElectricAccount109 {
    private  double kWh;
    private double rate=0.07;
    private double bill;

    public void  addKWh(double kWh){


        this.kWh +=kWh;
        this.bill=this.kWh*this.rate;

    }}

