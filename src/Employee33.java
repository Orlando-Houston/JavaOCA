public class Employee33 {
    String name;
    boolean contract;
    double salary;

    Employee33(){

//        line n1
       // this.name=new String ("Joe");
     //   this.contract=new Boolean (true);
       // this.salary=new Double (100);







    }
    public  String toString(){
        return  name + ":"+contract +":"+salary;
    }

    public static void main(String[] args) {
        Employee33 e=new Employee33 ();
//        line n2
        e.name="Joe";
        e.contract=true;
        e.salary=100;

        System.out.println (e);
    }
}
