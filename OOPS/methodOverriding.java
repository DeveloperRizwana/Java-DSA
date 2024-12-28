class A{
    int a;

    public int Rizu(){
        return 4;
    }

    public void meth2(){
        System.out.println("I am method 2 of calss A");
    }
}
class B extends A{

    @Override
    public void meth2(){ 
        System.out.println("I am mehtod 2 of class B");
    }
    
    public void meht3(){
        System.out.println("I am mehtod 3 of class B");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
        
    }
    
}
