public class Rectangle2 {
    int length;
    int breadth;

    public Rectangle2(int l, int b){
        this.length = l;
        this.breadth = b;
        System.out.println("I am rectangle constructor");
    }

    public int area(){
        return length * breadth;
    }

    public int perimeter(){
        return 2 * (length + breadth);
    }
    
}
class Cuboid extends Rectangle2{
    private int height;

    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        this.height = h;
    }

    public Cuboid(int l, int b, int h){
        super(l, b);
        this.height = h;
        System.out.println("I am cuboid constructor");
    }
    public int surfaceAreaOfCuboid(){
        return 2 * (length*breadth + length *height + breadth * height );
    }
    public int volume(){
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Cuboid c = new Cuboid(5, 3, 4);
        Rectangle2 r = new Rectangle2(5, 3);
        System.out.println("area of rectangle : " + r.area());
        System.out.println("Surface area of cuboid : " + c.surfaceAreaOfCuboid());
        System.out.println("Volume of cuboid: " + c.volume());
        
    }
    
}
//Volume=l×w×h........Surface Area=2lw+2lh+2wh
