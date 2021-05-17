class LogFileException extends  Exception{}
class AccessViolationException extends RuntimeException{}




public class App215 {
    public static void main(String[] args) throws LogFileException{

        App215 obj=new App215 ();
        try{
            obj.open ();
            obj.process ();


        }catch (Exception e){
            System.out.println ("completed");
        }

    }
    public void process() throws LogFileException{
        System.out.println ("processed");
        throw new LogFileException ();
    }
    public void open() throws AccessViolationException{
        System.out.println ("opened");
        throw new AccessViolationException ();

    }
}
