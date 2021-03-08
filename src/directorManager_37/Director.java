package directorManager_37;

public class Director extends Manager {
    public  int stockOptions;

    public static void main(String[] args) {
        Employee emp= new Employee ();
        Manager man=new Manager ();
        Director direc=new Director ();

        System.out.println (emp.salary);
        System.out.println (man.salary);
        System.out.println (man.budget);
        System.out.println (direc.stockOptions);
        System.out.println (direc.salary);
        System.out.println (direc.budget);

    }
}
