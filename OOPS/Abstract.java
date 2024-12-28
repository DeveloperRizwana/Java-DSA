abstract class Parent{

    public Parent(){
        System.out.println("I am constructor of Parent class");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
    abstract public void greet2();
}
class Child extends Parent{
 
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }

    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }

}
abstract class Child1 extends Parent{

    public void sh(){
        System.out.println("I am good");
    }

}
public class Abstract {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
        c.greet2();
        
        //Parent p = new Parent(); //error
        //Child1 c2 = new Child1(); // error
            
    }
    
}
