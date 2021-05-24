package person57;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Person> iList= Arrays.asList (new Person ("Hank",45),
                new Person ("Charlie",40),
                new Person ("Smith",38) );

//        line n1
        checkAge (iList,p -> p.getAge ()>40);

        checkAge (iList,(p) -> p.getAge ()>40);

        checkAge (iList,(Person  p)->p.getAge ()>45);
   // checkAge (iList,  Person57 p->     p.getAge ()>45);   //comp error
    //    checkAge (iList,() -> p.getAge ()>40); compile error


    }

    public static void checkAge(List<Person>list, Predicate<Person> predicate) {

        for (Person p:list){
            if (predicate.test (p)){
                System.out.println (p.name + " ");
            }
        }

    }

}
