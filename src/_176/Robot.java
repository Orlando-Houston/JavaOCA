package _176;

 public abstract class Robot implements Speakable {
     public  abstract void process();//replace public void process with abstract
}
class Humanoid extends Robot{

    @Override
    public void speak(String s) {
        System.out.println (s);

    }

    public void process(){
         System.out.println ("helping....");
     }

}
