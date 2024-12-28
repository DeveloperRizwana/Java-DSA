public class square {
    int side ;

    public int area(){
        return side * side;
    }

    public int perimeter(){
        return 4*side;
    }

    public static void main(String[] args) {
        square sq = new square();
        sq.side = 5;
        // area of square
        System.out.println("Area of square : " + sq.area());

        // perimeter of square
        System.out.println("Perimeter of square : " + sq.perimeter());
    }
    
}
