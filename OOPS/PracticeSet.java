abstract class Pen{

    abstract public void write();
    abstract public void refill();
}
class FountainPen extends Pen {

    public void ChangeNib(){
        System.out.println("Change nib");
    }

    @Override
    public void write(){
        System.out.println("I am writing this in method -> write");
    }

    @Override
    public void refill(){
        System.out.println("the refil of fountain pen is blue");
    }
}

public class PracticeSet {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.ChangeNib();
        fp.refill();
        fp.write();
    }
    
}
