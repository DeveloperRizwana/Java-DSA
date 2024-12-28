public class base {
    int x;

    public void print(){
        System.out.println("I am a constructor");
    }
    public void setX(int x){
        System.out.println("I am in base and setting x now : ");
        this.x = x;
    }
    public int getX(){
        return x;
    }
}
// inheritence
class derived extends base{
    int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    public static void main(String[] args) {
        // creating an object of base class
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());
       
        // creating an object of derived class
        derived c = new derived();
        c.setX(8);
        System.out.println(c.getX());
    }

}

