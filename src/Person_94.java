public class Person_94 {
    String name;
    int age;
    Person_94(String name){
        setName (name);

    }
    Person_94(String name,int age){
        //  Person94(name);
        setAge (age);
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
    public String show(){
        return  name+" " +age;
    }

    public static void main(String[] args) {
        Person_94 p1=new Person_94 ("Jesse");
        Person_94 p2=new Person_94 ("Walter,52");
        System.out.println (p1.show ());
        System.out.println (p2.show ());
    }
}
