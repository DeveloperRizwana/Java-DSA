public class Circle1 {
    int radius;
    double pi = 3.14159;

    public Circle1(int r){
        System.out.println("I am circle parametrized constructor ");
        this.radius = r;
    }

    public double area(){
        return pi*radius*radius;
    }

    public double perimeter(){
        return 2*pi*radius;
    }
    
}
class Cylinder1 extends Circle1{
    public int height;

    public Cylinder1(int r, int h){
        super(r);
        System.out.println("A am Cylinder1 parametarized constructor");
        this.height = h;
    }
     
    public double surfaceAreaOfCylinder(){
        return 2*(pi*radius*radius) + 2*(pi*height*radius);
    }

    public double volumeOfCylinder(){
        return pi*radius*radius*height;

    }

    public static void main(String[] args) {
        Circle1 c = new Circle1(4);
        Cylinder1 cl = new Cylinder1(3, 2);
        System.out.println(cl.surfaceAreaOfCylinder());
        System.out.println(cl.volumeOfCylinder());
    }
}
