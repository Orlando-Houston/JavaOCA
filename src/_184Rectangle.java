public class _184Rectangle {
    private double length;
    private double height;
    private double area;

    public  void setLength(double length) {
        this.length=length;
      //  setArea ();


    }
    public  void setHeight(double height) {
        this.height=height;
        setArea ();

    }
    public double getArea(){

        return area;
    }
    public void setArea(){
        area=length*height;
    }

    public static void main(String[] args) {
        _184Rectangle rec=new _184Rectangle ();
        rec.setLength (10.0);
        rec.setHeight (10.0);
        System.out.println (rec.getArea ());
    }

}
