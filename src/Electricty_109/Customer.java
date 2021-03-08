package Electricty_109;

public class Customer {

    ElectricAccount acct = new ElectricAccount ();

    public void  useElectricty(double kWh){
        acct.addKWh(kWh);

    }
}

 /*
        Any amount of electricity used by a customer (represented by an instance of the Customer class) must
contribute to the customer's bill (represented by the member variable bill) through the useElectricity
method.
 An instance of the Customer class should never be able to tamper with or decrease the value of the
member variable bill.
How should you write methods in the ElectricAccount class at line n1 so that the member variable bill is
always equal to the value of the member variable kwh multiplied by the member variable rate

Bir müşteri tarafından kullanılan herhangi bir miktarda elektrik (Müşteri sınıfının bir örneği ile temsil edilir),
useElectricity yöntemi aracılığıyla müşterinin faturasına (üye değişken faturasıyla temsil edilir) katkıda bulunmalıdır.
Müşteri sınıfının bir örneği, üye değişken faturasının değerini hiçbir zaman kurcalamamalı veya düşürmemelidir.
Üye değişkeni fatura her zaman üye değişkeninin değeri kwh ile üye değişken oranının
 çarpımına eşit olacak şekilde n1 satırındaki ElectricAccount sınıfındaki yöntemleri nasıl yazmalısınız?
     */
