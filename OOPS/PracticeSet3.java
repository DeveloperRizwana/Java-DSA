interface TvRemote{
    void changeChanel();
    void increaseVolume();
}
class SmartTvRemote implements TvRemote{
    @Override
    public void changeChanel(){
        System.out.println("Change this chanel with the smart tv remote");
    }

    @Override
    public void increaseVolume(){
        System.out.println("Increase the volume with the smart tv remote");
    }
}
class Tv implements TvRemote{

    @Override
    public void changeChanel(){
        System.out.println("Change this chanel from the tv");
    }

    @Override
    public void increaseVolume(){
        System.out.println("Increase the volume of tv");
    }

}

public class PracticeSet3 {
    public static void main(String[] args) {
        //TV instance
        Tv t = new Tv();
        t.changeChanel();
        t.increaseVolume();

        //remote instance (smart tv remote)
        SmartTvRemote sr = new SmartTvRemote();
        sr.changeChanel();
        sr.increaseVolume();
        
    }
    
}
