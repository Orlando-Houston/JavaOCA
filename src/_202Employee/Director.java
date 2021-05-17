package _202Employee;

public class Director extends Manager {
    public int stockOptions;

    public static void main(String[] args) {
        Employee employee=new Employee ();
        employee.salary=50_000;//working
     //   employee.budget=  //comp. error


        Employee manager=new Manager ();
     //   manager.budget=1_000_000;
        manager.salary=1_000_000;
     //   manager.stockOptions=1_000_000;  compiler error;

        Employee director=new Director ();
        director.salary=80_000;
      //  director.stockOption=1_000;
     //   director.budget=200_000;






        System.out.println (manager.salary);
    }
}
//Which two options compile when placed at line n1 of the main method? (Choose two.)
//A. director.stockOptions = 1_000;
//B. employee.salary = 50_000;
//C. manager.budget = 1_000_000;
//D. manager.stockOption = 500;
//E. employee.budget = 200_000;
//F. director.salary = 80_000;
//Answer: B F