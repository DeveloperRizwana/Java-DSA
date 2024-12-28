public class firstClass {
    int x;

    public int getX(){
        return x;
    }
    public firstClass(int x){
        this.x = x;
        
    }
    
}
class SecondClass extends firstClass{
    SecondClass(int y){
        super(y);
        System.out.println("I am a constructor");
    }

    public static void main(String[] args) {
        firstClass Class = new firstClass(65);
        SecondClass cl = new SecondClass(5);
        System.out.println(Class.getX());
        System.out.println(cl.getX());

    }

}
