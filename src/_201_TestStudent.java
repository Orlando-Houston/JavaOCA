public class _201_TestStudent {
    public static void main(String[] args) {
        Student1[] students=new Student1[3];
        students[1]=new Student1 ("Richard");
        students[2]=new Student1 ("Donald");
        for (Student1 s:students){
            System.out.println (" "+s.name);
        }
    }

}
