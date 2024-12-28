interface Bicylce{

    int a = 30;

    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBicylce{

    void bolwHornk3g();
    void bolwHornmhn();
}

class AvonCycle implements Bicylce, HornBicylce{

    void blowhorn(){
        System.out.println("Pee Pee Poo Poo");
    }

    public void applyBreak(int decrement){
    System.out.println("Applying break");

    }

    public void speedUp(int increment){
    System.out.println("Appllying speedUp ");

    }
    public void bolwHornk3g(){
        System.out.println("kabhi khushi kabhi gham");
    }
    public void bolwHornmhn(){
        System.out.println("main hoon na");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBreak(2);
        cycle.blowhorn();
        cycle.speedUp(2);

        // you can creat properties in interfaces
        System.out.println(cycle.a);
        //cycle.a = 23; ...error
        // you can't modify the properties in interfaces as they are final
        System.out.println(cycle.a);

        cycle.bolwHornk3g();
        cycle.bolwHornmhn();
        
    }
    
}
