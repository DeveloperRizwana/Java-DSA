public class rectangle {
    int length;
    int breadth;

    public int area(){
        return length * breadth;
    }

    public int perimeter(){
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        rectangle rt = new rectangle();
        rt.length = 5;
        rt.breadth = 6;

        // area of rectangle
        System.out.println("Area of rectangle : " + rt.area());

        // perimeter of rectangle
        System.out.println(" perimeter of rectangle : " + rt.perimeter());
    }
    
}
