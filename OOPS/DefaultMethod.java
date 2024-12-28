interface camera{

    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void recordVideoIn4k(){
        greet();
        System.out.println("Recording video in 4k");
    }
}
interface wifi{

    String[] getNetworks();
    void connectToNetworks(String network);
}

class MyCellPhone{

    void callNumber(int phoneNumber){
        System.out.println("calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting....");
    }
   
}
class MySmartPhone extends MyCellPhone implements wifi, camera{

    public void takeSnap(){
       System.out.println("taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }

   // public void recordVideoIn4k(){
     //   System.out.println("taking snap and recording video in 4k");
    //}

    public String[] getNetworks(){
        System.out.println("getting list of networks.....");
        String[] listOfNetwroks = {"rizu123" , "choti234" , "aahish567"};
        return listOfNetwroks;
    }

    public void connectToNetworks(String network){
        System.out.println("connecting... " + network);
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        MySmartPhone phone = new MySmartPhone();
        String[] arr = phone.getNetworks();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        phone.connectToNetworks("rizu123");
        phone.callNumber(121334454);
        phone.pickCall();
        phone.takeSnap();
        phone.recordVideoIn4k();
    }
    
}
