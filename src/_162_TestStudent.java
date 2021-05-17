class Student{
    String name;
    int age;
}

public class _162_TestStudent {
    public static void main(String[] args) {
        Student_1 s1= new Student_1 ();
        Student_1 s2= new Student_1 ();
        Student_1 s3= new Student_1 ();
        s1=s3;
        s3=s2;
        s2=null;
    }
}
//Which statement is true?
//A. After line 11, three objects are eligible for garbage collection.
// B. After line 11, two objects are eligible for garbage collection.
// C. After line 11, one object is eligible for garbage collection.
// D. After line 11, none of the objects are eligible for garbage collection. Answer:
