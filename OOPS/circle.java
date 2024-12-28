public class circle {
    int radius;
    double pi = 3.14159;

    public double area(){
        return pi*radius*radius;
    }

    public double perimeter(){
        return 2*pi*radius;
    }

    public static void main(String[] args) {
        circle cl = new circle();
        cl.radius = 7;

        // area of a circle
        System.out.println("Area of a circle : " + cl.area());

        // perimeter of a circle
        System.out.println(" perimeter of a circle : " + cl.perimeter());
    }
}
