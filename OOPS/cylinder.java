public class cylinder {
    private int radius;
    private int height;
    double pi = 3.14159;


    public cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public double surfaceAreaOfCylinder(){
        return 2*(pi*radius*radius) + 2*(pi*height*radius);
    }

    public double volumeOfCylinder(){
        return pi*radius*radius*height;

    }

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public static void main(String[] args) {
        cylinder cl = new cylinder(12, 5);
        //cl.setRadius(12);
        System.out.println("Radius of a cylinder: " + cl.getRadius());

        //cl.setHeight(5);
        System.out.println("Height of a cylinder: " + cl.getHeight());

        System.out.println("Surface area of the cylinder: " + cl.surfaceAreaOfCylinder());
        System.out.println("Volume of the cylinder: " + cl.volumeOfCylinder());
    }
    
    
}
