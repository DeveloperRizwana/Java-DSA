class Base1{
    int x;

    Base1(){
        System.out.println("I am a base class constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor of base class with value of x as : " + x);
    }


}
class Derived1 extends Base1{
    int  y;

    Derived1(){
        //super(3);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of derived class with value of y as : " + y);
    }

}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of child derived class with value of z as : " + z);
    }
}
public class constructorInInheritence {
    public static void main(String[] args) {
       // Base1 base = new Base1();
      //  Derived1 derived = new Derived1();
     // Derived1 derived = new Derived1(12, 5);

     ChildOfDerived child = new ChildOfDerived(6, 7, 8);
        
    }
    
}
