interface SampleInterface{
    void meth1();
    void meth2();
}
interface ChildSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}
class MySampleInterface implements ChildSampleInterface{

    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }

    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}

public class InheritanceInInterface {
    public static void main(String[] args) {
        MySampleInterface obj = new MySampleInterface();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();

    }
    
}
