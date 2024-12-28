interface camera1{

    void takeSnap();
    void recordVideo();
    default void recordVideoIn4k(){
        System.out.println("Recording video in 4k");
    }
}
interface wifi1{

    String[] getNetworks();
    void connectToNetworks(String network);
}

class MyCellPhone1{

    void callNumber(int phoneNumber){
        System.out.println("calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting....");
    }
   
}
class MySmartPhone1 extends MyCellPhone1 implements wifi1, camera1{

    public void takeSnap(){
       System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }

    public void recordVideoIn4k(){
        System.out.println("taking snap and recording video in 4k");
    }

    public String[] getNetworks(){
        System.out.println("getting list of networks.....");
        String[] listOfNetwroks = {"rizu123" , "choti234" , "aahish567"};
        return listOfNetwroks;
    }

    public void connectToNetworks(String network){
        System.out.println("connecting... " + network);
    }
}

public class PolymorphismInInterface {
    public static void main(String[] args) {
        camera1 cam1 = new MySmartPhone1(); // this is a smartPhone but use it as a camera
        //cam1.getNetworks(); // ...-> NOT ALLOWED
        //cam1.connectToNetworks();  -> NOT ALLOWED
        cam1.recordVideoIn4k();
        cam1.recordVideo();
    }
    
}
