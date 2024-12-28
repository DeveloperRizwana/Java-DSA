public class sphere {
    private int radius;
    double pi = 3.14159;

    public double surfaceAreaOfSphere(){
        return 4 * pi * radius * radius;
    }
    public double volumeOfSphere(){
        return (4.0 / 3.0) * pi * radius * radius * radius;
    }
    public sphere(int radius){
        this.radius = radius;
    }

    

    public static void main(String[] args) {
        sphere sp = new sphere(5);

        System.out.println(sp.surfaceAreaOfSphere());
        System.out.println(sp.volumeOfSphere());

    }
    
}
