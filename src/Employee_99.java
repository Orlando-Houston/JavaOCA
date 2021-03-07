public class Employee_99 {
    private String name;
    private int age;
    private int salary;



    public Employee_99(String name,int age) {
        setName (name);
        setAge (age);
        setSalary (salary);

    }

    public Employee_99(String name,int age,int salary){
        setSalary (salary);
        //  this(name, age);

    }
    public void printDetails(){
        System.out.println (name +" "+age + " "+ salary);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
class Test99{
    public static void main(String[] args) {
        //    Employee_99 e1=new Employee_99 ();
        Employee_99 e2=new Employee_99 ("Jack",50);
        Employee_99 e3=new Employee_99 ("Chloe",40,5000);

        //  e1.printDetails ();
        e2.printDetails ();
        e3.printDetails ();
    }
}
//Both the Employee class and the Test class fail to compile

