public class Student_1 {
    int a;
    int b;

    public void setData(int c,int d){
        a=c;
        b=d;
    }
    public void showData(){
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }
    public static void main(String args[]){
        Student_1 s1 = new Student_1 ();
        Student_1 s2 = new Student_1 ();
        s1.setData(1,2);
        s2.setData(3,4);
        s1.showData();
        s2.showData();
        Student_1 s3;
        s3=s2;
        s3.showData();
        s2=null;
        s3.showData();
        s3=null;
        s3.showData();
    }
}
