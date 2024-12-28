abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{

    public void recordingVideo(){
        System.out.println("recording video");
    }

    public void ring(){
        System.out.println("ringing....");

    }
    public void lift(){
        System.out.println("lifting...");
    }
    public void disconnect(){
        System.out.println("diconnecting the telephone");

    }
}

public class PracticeSet2 {
    public static void main(String[] args) {
        Telephone t = new SmartTelephone();
        t.disconnect();
        t.lift();
        t.disconnect();

        SmartTelephone smart = new SmartTelephone();
        smart.recordingVideo();
    }
}
