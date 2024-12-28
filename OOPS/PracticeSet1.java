class Monkey{

    public void Jump(){
        System.out.println("monkey is jumping");
    }
    public void bite(){
        System.out.println("monkey bites my younger sister");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal {
    public void run(){
        System.out.println("running......");
    }
    @Override
    public void eat(){
        System.out.println("eating is basic human need");
    }

    @Override
    public void sleep(){
        System.out.println("sleeping");
    }

}

public class PracticeSet1 {
    public static void main(String[] args) {
        Human h = new Human();
        h.Jump();
        h.eat();
        h.sleep();
        h.bite();
        h.run();
        
        Monkey m = new Human();
        m.Jump();
        m.bite();

        BasicAnimal b = new Human();
        b.eat();
    }
    
}
